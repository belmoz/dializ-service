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
public class PacientDto {
	String id;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	LocalDateTime admissionDate;
	Integer localId;
	PacientPersonalDto personal;
	PacientDiagnosisDto diagnosis;
	PacientStatusDto status;
	PacientAnalyzesDto analyzes;
	PacientHepatitisMarkersDto hepatitisMarkers;
}
