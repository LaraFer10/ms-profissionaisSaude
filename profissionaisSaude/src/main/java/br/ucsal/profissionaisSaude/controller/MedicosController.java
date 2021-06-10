package br.ucsal.profissionaisSaude.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.profissionaisSaude.service.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicosController {
	
	public String obterNome(String crm) {
		return (new MedicoService()).obterNomePorCRM(crm);
	}

}
