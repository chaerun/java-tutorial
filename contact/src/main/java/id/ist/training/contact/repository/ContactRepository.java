package id.ist.training.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.ist.training.contact.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	Contact findByName(String name);

}
