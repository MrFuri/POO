package empresa;

public class EmpresaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregados ep1 = new Empregados("Jorge", "T.I.");
		ep1.setSalHrs(32);
		ep1.setHrsMes(160);
		
		Empregados ep2= new Empregados("Milla", "Diretoria");
		ep2.setSalHrs(50);
		ep2.setHrsMes(160);
		
		ep1.calculaSalarioMensal();
		ep1.MostrarDados();
		ep2.calculaSalarioMensal();
		ep2.MostrarDados();
	}

}
