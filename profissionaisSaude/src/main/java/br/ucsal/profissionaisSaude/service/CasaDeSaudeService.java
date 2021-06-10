package br.ucsal.profissionaisSaude.service;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.profissionaisSaude.model.CasaDeSaude;

public class CasaDeSaudeService {

	
	public List<CasaDeSaude> listNursingHomeByCRM(String crm) {
		List<CasaDeSaude> nursingHomes = listNursingHome();
		List<CasaDeSaude> filteredNursingHomes = new ArrayList<>();
		for(CasaDeSaude nursingHome : nursingHomes) {
			for(String crmFromList : nursingHome.getCrm()) {
				if(crmFromList.equals(crm)) {
					filteredNursingHomes.add(nursingHome);
				}
			}
			
		}
		return filteredNursingHomes;
	}
	
	public List<CasaDeSaude> listNursingHome(){
		List<CasaDeSaude> nursingHomeList = new ArrayList<>();
		
		CasaDeSaude nursingHome1;
		nursingHome1 = new CasaDeSaude();
		nursingHome1.setId(1);
		nursingHome1.setTipo("Hospital");
		nursingHome1.setCrm("2847564CRM");
		nursingHome1.setNome("João Ricardo");
		nursingHomeList.add(nursingHome1);
		
		CasaDeSaude nursingHome2;
		nursingHome2 = new CasaDeSaude();
		nursingHome2.setId(2);
		nursingHome1.setTipo("Clínica");
		nursingHome2.setCrm("9458540CRM");
		nursingHome2.setNome("Maria Fernandes");
		nursingHomeList.add(nursingHome2);
		
		CasaDeSaude nursingHome3;
		nursingHome3 = new CasaDeSaude();
		nursingHome3.setId(3);
		nursingHome1.setTipo("Clínica");
		nursingHome3.setCrm("02937464CRM");
		nursingHome3.setNome("George Rodrigues");
		nursingHomeList.add(nursingHome3);
		
		return nursingHomeList;
	}
	

}
