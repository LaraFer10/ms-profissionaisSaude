package br.ucsal.profissionaisSaude.model;

import java.util.List;

public class CasaDeSaude {

	private int id;
	private String nome;
	private String tipo;
	private List<String> crm;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm.add(crm);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
