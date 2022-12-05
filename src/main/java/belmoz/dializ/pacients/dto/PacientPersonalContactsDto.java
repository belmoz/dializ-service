package belmoz.dializ.pacients.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacientPersonalContactsDto {
	String district;
	String city;
	String address;
	String phoneHome;
	String phoneMobile;
	String phoneRelatives;
	String nameRelatives;
}
