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
@EqualsAndHashCode(of = {"date"})
public class PacientAnalyze {
	LocalDateTime date;
	double hemoglobin,
		mcv,
		mch,
		totalProtein,
		albumen,
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
