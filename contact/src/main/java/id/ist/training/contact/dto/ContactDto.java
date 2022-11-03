package id.ist.training.contact.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import id.ist.training.contact.entity.Contact.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto implements Serializable {
	
	private static final long serialVersionUID = -5238915463812109415L;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	private String email;
	private Gender gender;

}
