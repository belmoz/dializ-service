package belmoz.dializ.pacient.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"startDialysisDate", "transplantWaitingDate", "departureDate"})
public class PacientStatus {
	String hospital;
	LocalDateTime startDialysisDate;
	LocalDateTime transplantWaitingDate;
	LocalDateTime departureDate;
	String departureCause;
}
