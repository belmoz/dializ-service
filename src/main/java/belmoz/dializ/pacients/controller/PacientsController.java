package belmoz.dializ.pacients.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import belmoz.dializ.pacients.dto.NewPacientDto;
import belmoz.dializ.pacients.dto.PacientDto;
import belmoz.dializ.pacients.service.PacientsService;
import lombok.RequiredArgsConstructor;

@RestController
//@RequestMapping("/pacient")
@RequiredArgsConstructor
public class PacientsController {
	
	final PacientsService pacientsService;
	
	@PostMapping("/pacient")
	public PacientDto addNewPacient(NewPacientDto newPacientDto) {
		return pacientsService.addNewPacient(newPacientDto);
	}
}
