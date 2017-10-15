package lojaDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private int id;
	private String nome;
	private String sigla;
	private List<Cidade> listaCidade = null;
	
	
	public Estado() {
		this.setListaCidade(new ArrayList<Cidade>());
	}
	public Estado(int id, String nome, String sigla) {
		this();
		this.setId(id);
		this.setNome(nome);
		this.setSigla(sigla);
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public List<Cidade> getListaCidade() {
		return listaCidade;
	}
	public void setListaCidade(List<Cidade> listaCidade) {
		this.listaCidade = listaCidade;
	}
}
