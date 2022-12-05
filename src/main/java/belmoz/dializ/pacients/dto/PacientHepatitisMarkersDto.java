package belmoz.dializ.pacients.dto;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacientHepatitisMarkersDto {
	List<PacientHepatitisMarkersAnalysisDto> analyzes;
	PacientHepatitisMarkersVaccinationDto vaccination;
}
