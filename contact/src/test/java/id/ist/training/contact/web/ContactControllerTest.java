package id.ist.training.contact.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import id.ist.training.contact.entity.Contact;
import lombok.SneakyThrows;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ContactControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@SneakyThrows
	void givenValidId_whenGet_thenReturnOk() {
		ResponseEntity<Contact> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/contacts/1").toString(), Contact.class);
		Contact contact = response.getBody();
		assertEquals("Someone", contact.getName());
	}

}
