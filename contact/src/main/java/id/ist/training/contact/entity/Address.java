package id.ist.training.contact.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address implements Serializable {
	
	private static final long serialVersionUID = -6188252857304593472L;
	
	@Id
    @GeneratedValue
	private Long id;
	
	private String street;
	private String city;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="contactId")
    private Contact contact;

}
