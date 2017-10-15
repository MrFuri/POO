package lojaDepartamento;

import java.util.List;
import java.util.ArrayList;

public class Cidade {
	private int id;
	private String nome;
	private Estado estado;
	private List<Endereco> listaEndereco = null;
	
	public Cidade() {
		this.setListaEndereco(new ArrayList<Endereco>());
	}
	public Cidade(int id, String nome, Estado estado) {
		this();
		this.setId(id);
		this.setNome(nome);
		this.setEstado(estado);
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}
	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}
}
