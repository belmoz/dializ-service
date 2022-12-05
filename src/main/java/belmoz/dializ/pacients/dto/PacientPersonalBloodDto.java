package belmoz.dializ.pacients.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacientPersonalBloodDto {
	String bloodType;
	String rhFactor;
}
