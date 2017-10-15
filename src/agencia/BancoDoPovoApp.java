package agencia;

public class BancoDoPovoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agencia agencia = new Agencia(1, "Agencia Centro");
		
		Conta conta1 = new Conta("Jorge", 1);
		conta1.setSaldo(100);
		agencia.AdicionarConta(conta1);
		
		Conta conta2 = new Conta("André", 2);
		conta2.setSaldo(500);
		agencia.AdicionarConta(conta2);
		
		Conta conta3 = new Conta("Millana", 3);
		conta3.setLimite(1000);
		conta3.setSaldo(3000);
		agencia.AdicionarConta(conta3);
		
		conta1.depositar(300);
		conta1.sacar(1000);
		conta2.transferir(conta3, 500);
		System.out.println(conta1.getSaldo());
		
		for(Conta contas : agencia.getlistaConta()) {
			System.out.println(String.format("Correntista     : %s", contas.getCorrentista()));
			System.out.println(String.format("Número da Conta : %d", contas.getCodigo()));
			System.out.println(String.format("Saldo           : %f", contas.getSaldo()));
			System.out.println(String.format("Limite          : %f", contas.getLimite()));
			System.out.println();
		}
		
		
	}

}
