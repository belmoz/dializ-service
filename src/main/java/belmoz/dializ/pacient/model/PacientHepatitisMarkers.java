package belmoz.dializ.pacient.model;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PacientHepatitisMarkers {
	List<HepatitisAnalysis> analyzes;
	HepatitisVaccination vaccination;
	
	
	public PacientHepatitisMarkers(List<HepatitisAnalysis> analyzes, HepatitisVaccination vaccination) {
		this.analyzes = new ArrayList<>();
		this.vaccination = vaccination;
	}

	public boolean addHepatitisAnalisis(HepatitisAnalysis hepatitisAnalysis) {
		return analyzes.add(hepatitisAnalysis);
	}
}
