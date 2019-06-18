package br.udesc.ceavi.pin2.trafficsimulator.model;

public class ModuloSistema {
	
	private int id;
	private String nome;
	private String classePrincipal;
	
	public ModuloSistema() {
		super();
	}
	
	public ModuloSistema(int id, String nome, String classePrincipal) {
		super();
		this.id = id;
		this.nome = nome;
		this.classePrincipal = classePrincipal;
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

	public String getClassePrincipal() {
		return classePrincipal;
	}

	public void setClassePrincipal(String classePrincipal) {
		this.classePrincipal = classePrincipal;
	}
	
}
