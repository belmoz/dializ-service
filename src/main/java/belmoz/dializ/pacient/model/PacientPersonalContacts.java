package belmoz.dializ.pacient.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"district"})
public class PacientPersonalContacts {
	String district;
	String city;
	String address;
	String phoneHome;
	String phoneMobile;
	String phoneRelatives;
	String nameRelatives;
}
