package belmoz.dializ.pacients.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public class NewPacientDto {
	Integer localId;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	LocalDateTime startDialysisDate;
	String lastName;
	String firstName;
	String fatherName;
	Boolean sex;
	String hospital;
}
