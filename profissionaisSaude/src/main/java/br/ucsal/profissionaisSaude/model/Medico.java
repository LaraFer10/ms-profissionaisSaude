package br.ucsal.profissionaisSaude.model;

import java.util.List;

public class Medico {

	private int id;
	private String nome;
	private String crm;
	private String especialidade;
	private List<Atendimento> atendimentos;
	
	
	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(Atendimento atendimentos) {
		this.atendimentos.add(atendimentos);
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
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
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
}
