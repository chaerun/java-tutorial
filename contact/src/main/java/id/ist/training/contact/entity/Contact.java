package id.ist.training.contact.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contact implements Serializable {
	
	private static final long serialVersionUID = 3351905301239684283L;
	
	public enum Gender {
		FEMALE, MALE;
	}
	
	@Id
    @GeneratedValue
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	private String email;
	private Gender gender;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;

}
