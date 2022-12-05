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
@EqualsAndHashCode(of = {"bloodType", "rhFactor"})
public class PacientPersonalBlood {
	String bloodType;
	String rhFactor;
}
