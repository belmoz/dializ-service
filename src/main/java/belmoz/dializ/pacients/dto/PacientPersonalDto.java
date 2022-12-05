package belmoz.dializ.pacients.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacientPersonalDto {
	String lastName;
	String firstName;
	String fatherName;
	Boolean sex;
	Integer height;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	LocalDateTime birthDate;
	PacientPersonalContactsDto contacts;
	PacientPersonalBloodDto blood;
	
}
