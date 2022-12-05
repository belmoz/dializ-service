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
public class PacientAnalyzesDto {
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	LocalDateTime date;
	Double hemoglobin,
			mcv,
			mch,
			totalProtein,
			creatinine,
			urea,
			glucose,
			cholesterol,
			triglycerides,
			sodium,
			potassium,
			uricAcid,
			ferritin,
			transferrin,
			iron,
			сReactiveProtein,
			calcium,
			phosphorus,
			parathormone,
			alkalinePhosphatase,
			diuresis,
			dryWeight,
			ktV;
}
