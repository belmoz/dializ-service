package belmoz.dializ.pacient.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@Document(collection = "pacients")
public class Pacient {
	String id;
	@Setter
	LocalDateTime admissionDate;
	@Setter
	int localId;
	PacientPersonal personal;
	PacientDiagnosis diagnosis;
	PacientStatus status;
	List<PacientAnalyze> analyze;
	PacientHepatitisMarkers hepatitisMarkers;
	
	public Pacient() {
		this.analyze = new ArrayList<>();
		this.personal = new PacientPersonal();
		this.diagnosis = new PacientDiagnosis();
		this.status = new PacientStatus();
		this.hepatitisMarkers = new PacientHepatitisMarkers();
	}
	
	public Pacient(LocalDateTime admissionDate, int localId) {
		this();
		this.admissionDate = admissionDate;
		this.localId = localId;
		
	}
	
	public boolean addAnalyze(PacientAnalyze pacientAnalyze) {
		return analyze.add(pacientAnalyze);
	}
	
}
