package br.ucsal.profissionaisSaude.service;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.profissionaisSaude.model.Medico;

public class MedicoService {

	public String obterNomePorCRM(String crm) {
		List<Medico> medicos = listaDeMedicos();
		for(Medico medico : medicos) {
			if(medico.getCrm().equals(crm)) {
				return medico.getNome();
			}
		}
		return null;
	}
	
	public List<Medico> listaDeMedicos(){
		List<Medico> lista = new ArrayList<>();
		Medico medico1;
		
		medico1 = new Medico();
		medico1.setId(1);
		medico1.setCrm("2847564CRM");
		medico1.setNome("João Ricardo");
		lista.add(medico1);
		
		Medico medico2;
		
		medico2 = new Medico();
		medico2.setId(2);
		medico2.setCrm("9458540CRM");
		medico2.setNome("Maria Fernandes");
		lista.add(medico2);
		
		Medico medico3;
		
		medico3 = new Medico();
		medico3.setId(3);
		medico3.setCrm("02937464CRM");
		medico3.setNome("George Rodrigues");
		lista.add(medico3);
		return lista;
	}

}
