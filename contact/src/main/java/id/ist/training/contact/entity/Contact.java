package id.ist.training.contact.entity;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
	
	private static final long serialVersionUID = 3351905301239684283L;
	
	public enum Gender {
		FEMALE, MALE;
	}
	
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	private String email;
	private Gender gender;

}
