package belmoz.dializ.pacients.service;

import belmoz.dializ.pacients.dto.NewPacientDto;
import belmoz.dializ.pacients.dto.PacientDto;

public interface PacientsService {
	PacientDto addNewPacient(NewPacientDto newPacientDto);
}
