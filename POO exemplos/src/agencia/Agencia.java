package agencia;

import java.util.List;
import java.util.ArrayList;

public class Agencia {

	private String nomeAgencia;
	private int codAgencia;
	private List<Conta> listaconta = new ArrayList<Conta>();

	Agencia(int codigo, String nome) {
		this.codAgencia = codigo;
		this.nomeAgencia = nome;
	}

	public String getNomeAgencia() {
		return this.nomeAgencia;
	}

	public void setNomeAgencia(String nome) {
		this.nomeAgencia = nome;
	}

	public int getCodAgencia() {
		return this.codAgencia;
	}

	public void setCodAgencia(int codigo) {
		this.codAgencia = codigo;
	}

	public List<Conta> getlistaConta() {
		return this.listaconta;
	}

	public void setlistaConta(List<Conta> listacontas) {
		this.listaconta = listacontas;
	}

	// Método
	public void AdicionarConta(Conta conta) {
		listaconta.add(conta);
	}

}
