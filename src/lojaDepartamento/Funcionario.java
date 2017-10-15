package lojaDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	private String matricula;
	private String senha;
	private Departamento departamento;
	private List<Venda> listaVenda = null;
	
	public Funcionario() {
		setListaVenda(new ArrayList<Venda>());
	}
	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}
	public Funcionario(String nome, String matricula) {
		this(nome);
		this.setMatricula(matricula);
	}
	public Funcionario(String nome, String matricula, String senha) {
		this(matricula);
		this.setSenha(senha);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<Venda> getListaVenda() {
		return listaVenda;
	}
	public void setListaVenda(List<Venda> listaVenda) {
		this.listaVenda = listaVenda;
	}
}
