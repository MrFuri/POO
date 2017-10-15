package excecao;

public class NumberExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat kappa = new NumberFormat();
		
		kappa.setValor("195");
		kappa.Converter();
		System.out.println(kappa.getInteiro());
	}
}
