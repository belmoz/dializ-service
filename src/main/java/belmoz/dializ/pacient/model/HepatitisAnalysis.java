package belmoz.dializ.pacient.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"hbsag", "antiHCV", "analysisDate"})
public class HepatitisAnalysis {
	boolean hbsag;
	boolean antiHCV;
	LocalDateTime analysisDate;
}
