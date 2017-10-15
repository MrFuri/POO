package agencia;

public class Conta {

	private String correntista;
	private int codigo;
	private float saldo;
	private float limite;

	public Conta(String nome, int codigo) {
		this.setCorretista(nome);
		this.setCodigo(codigo);
	}

	// GET - SET
	public String getCorrentista() {
		return this.correntista;
	}

	public void setCorretista(String nome) {
		this.correntista = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int numconta) {
		this.codigo = numconta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// MÉTODOS
	public void depositar(float valor) {
		this.saldo += valor;
	}

	public void sacar(float valor) {
		if (this.limite > 0) {
			if (this.saldo < valor) {
				this.limite -= valor;
				System.out.println("Limite usado.");
			} else {
				this.saldo -= valor;
				System.out.println("Aprovado.");
			}
		} else if (this.saldo < valor) {
			System.out.println("Transação não Aprovada.");
		} else
			System.out.println("Aprovado.");
	}

	public void transferir(Conta contaDestino, float valor) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else
			System.out.println("Transação não Aprovada.\n");
	}

}
