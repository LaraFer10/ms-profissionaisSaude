package br.ucsal.profissionaisSaude.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.profissionaisSaude.model.CasaDeSaude;
import br.ucsal.profissionaisSaude.service.CasaDeSaudeService;

@RestController
@RequestMapping("/casadesaude")
public class CasaDeSaudeController {
	
	public List<CasaDeSaude> listNursingHomeByCRM(String crm) {
		return (new CasaDeSaudeService()).listNursingHomeByCRM(crm);
	}
	
}
