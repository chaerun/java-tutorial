package id.ist.training.contact.web;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;

import id.ist.training.contact.dto.ContactDto;
import id.ist.training.contact.entity.Contact;
import id.ist.training.contact.exception.InvalidDataException;
import id.ist.training.contact.service.ContactService;

@RestController
@RequestMapping(path = "/contacts")
public class ContactController {

	@Autowired
	private ContactService service;

	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping
	public List<Contact> findAll() {
		return service.findAll();
	}

	@GetMapping(path = "/{id}")
	public Contact findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long create(@Valid @RequestBody ContactDto contactDto) {
		Objects.requireNonNull(contactDto);
		Contact contact = new Contact();
		BeanUtils.copyProperties(contactDto, contact);
		return service.create(contact);
	}

	@PutMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody ContactDto contactDto) {
		Objects.requireNonNull(contactDto);
		Contact contact = new Contact();
		BeanUtils.copyProperties(contactDto, contact);
		service.update(id, contact);
	}

	@PatchMapping(path = "/{id}", consumes = "application/json-patch+json")
	public Contact updateCustomer(@PathVariable Long id, @RequestBody JsonPatch patch) {
		try {
			Contact contact = service.findById(id);
			JsonNode patched = patch.apply(objectMapper.convertValue(contact, JsonNode.class));
			Contact patchedContact = objectMapper.treeToValue(patched, Contact.class);
			service.update(id, patchedContact);
			return patchedContact;
		} catch (JsonPatchException | JsonProcessingException e) {
			throw new InvalidDataException();
		}
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.deleteById(id);
	}

}
