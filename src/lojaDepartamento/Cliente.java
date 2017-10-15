package lojaDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf_cnpj;
	private Endereco endereco;
	private String telefone;
	private List<Venda> listaCompra = null;
	
	public Cliente() {
		this.setListaCompra(new ArrayList<Venda>());
	}
	public Cliente(String nome) {
		this();
		this.setNome(nome);
	}
	public Cliente(String nome, String cpf_cnpj) {
		this(nome);
		this.setCpf_cnpj(cpf_cnpj);
	}
	/*public Cliente(String nome, String cpf_cnpj, Endereço endereço, String telefone, List<Venda> listaCompra) {
		this(nome,cpf_cnpj);
		this.setEndereço(endereço);
		this.setTelefone(telefone);
	}*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Venda> getListaCompra() {
		return listaCompra;
	}
	public void setListaCompra(List<Venda> listaCompra) {
		this.listaCompra = listaCompra;
	}
	
}
