package lojaDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private int id;
	private String nome;
	private String sigla;
	private List<Funcionario> listFuncionario = null;
	
	public Departamento() {
		setListFuncionario(new ArrayList<Funcionario>());
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

	public List<Funcionario> getListFuncionario() {
		return listFuncionario;
	}

	public void setListFuncionario(List<Funcionario> listFuncionario) {
		this.listFuncionario = listFuncionario;
	}
}
