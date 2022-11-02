package id.ist.training.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import id.ist.training.contact.entity.Contact;
import id.ist.training.contact.entity.Contact.Gender;
import id.ist.training.contact.exception.ContactNotFoundException;

@Service
public class ContactService {

	private List<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
		contacts.add(Contact.builder()
				.id(1L)
				.name("Someone")
				.email("someone@mail.com")
				.gender(Gender.MALE)
				.build());
		contacts.add(Contact.builder()
				.id(2L)
				.name("Someone Else")
				.email("someone.else@mail.com")
				.gender(Gender.MALE)
				.build());
	}

	public List<Contact> findAll() {
		return contacts;
	}

	public Contact findById(Long id) {
		return contacts.stream()
				.filter(e -> e.getId().equals(id))
				.findFirst()
				.orElseThrow(ContactNotFoundException::new);
	}

	public Long create(Contact contact) {
		Long lastId = contacts.stream().map(Contact::getId).max(Long::compare).orElse(1L);
		contact.setId(lastId + 1);
		contacts.add(contact);
		return contact.getId();
	}

	public void update(Long id, Contact updateContact) {
		Contact contact = findById(id);
		BeanUtils.copyProperties(updateContact, contact);
	}

	public void deleteById(Long id) {
		Contact contact = findById(id);
		contacts.remove(contact);
	}

}
