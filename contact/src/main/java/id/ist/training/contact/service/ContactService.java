package id.ist.training.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ist.training.contact.entity.Contact;
import id.ist.training.contact.exception.ContactNotFoundException;
import id.ist.training.contact.repository.ContactRepository;
import id.ist.training.contact.util.ObjectUtils;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;

	public List<Contact> findAll() {
		return repository.findAll();
	}

	public Contact findById(Long id) {
		return repository.findById(id).orElseThrow(ContactNotFoundException::new);
	}

	public Long create(Contact contact) {
		return repository.save(contact).getId();
	}

	public void update(Long id, Contact updateContact) {
		Contact contact = findById(id);
		ObjectUtils.copyProperties(contact, updateContact);
		repository.save(contact);
	}

	public void deleteById(Long id) {
		Contact contact = findById(id);
		repository.delete(contact);
	}

}
