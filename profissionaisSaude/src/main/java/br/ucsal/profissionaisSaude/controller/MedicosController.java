package br.ucsal.profissionaisSaude.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.profissionaisSaude.service.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicosController {
	
	@GetMapping(path="/nome/{crm}")
	public String obterNome(@PathVariable String crm) {
		return (new MedicoService()).obterNomePorCRM(crm);
	}
	

}
