package belmoz.dializ.pacient.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = {"lastName", "firstName", "blood"})
public class PacientPersonal {
	String lastName;
	String firstName;
	String fatherName;
	boolean sex;
	int height;
	LocalDateTime birthDate;
	PacientPersonalContacts contacts;
	PacientPersonalBlood blood;
	
	public PacientPersonal() {
		this.contacts = new PacientPersonalContacts();
		this.blood = new PacientPersonalBlood();
	}
}
