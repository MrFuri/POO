package time;


public class TimeApp {

	public static void main(String[] args) {
		
		TimeLista lista1 = new TimeLista();
		
		Time clube = new Time("Flamengo", "Rio de Janeiro");
		lista1.adicionarTime(clube);
		clube = new Time("Corithians", "São Paulo");
		lista1.adicionarTime(clube);
		clube = new Time("Sport", "Pernambuco");
		lista1.adicionarTime(clube);
		
		for(Time cc : lista1.getListaTime()) {
			System.out.println(String.format("Time: %s", cc.getNomeTime()));
			System.out.println(String.format("Estado: %s", cc.getEstadoTime()));
			System.out.println();
		}

	}

}
