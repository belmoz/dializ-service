package belmoz.dializ.pacients.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacientHepatitisMarkersAnalysisDto {
	Boolean hbsag;
	Boolean antiHVC;
	LocalDateTime analysisDate;
}
