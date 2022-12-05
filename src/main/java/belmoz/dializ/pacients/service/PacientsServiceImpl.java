package belmoz.dializ.pacients.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import belmoz.dializ.pacient.dao.PacientsRepository;
import belmoz.dializ.pacient.model.Pacient;
import belmoz.dializ.pacient.model.PacientPersonal;
import belmoz.dializ.pacients.dto.NewPacientDto;
import belmoz.dializ.pacients.dto.PacientDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PacientsServiceImpl implements PacientsService {

	final PacientsRepository pacientsRepository;
	final ModelMapper modelMapper;
	
	@Override
	public PacientDto addNewPacient(NewPacientDto newPacientDto) {
		Pacient pacient = new Pacient(newPacientDto.getStartDialysisDate(), 100);
		
//		Pacient pacient = modelMapper.map(newPacientDto, Pacient.class);
		pacientsRepository.save(pacient);
		return modelMapper.map(pacient, PacientDto.class);
	}

}
