package vetorDinamico;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz<Integer> teste = new Matriz<Integer>(2);
		
		teste.criarDimencao(0, 3);
		teste.criarDimencao(1, 3);
		
		teste.adicionarElemento(0, 5);
		teste.adicionarElemento(0, 10);
		teste.adicionarElemento(1, 13);
		teste.adicionarElemento(1, 1, 14);
		
		System.out.println(teste.contem(10));
		System.out.println(teste.contem(1, 0, 11));
		System.out.println(teste.getElemento(0, 0));
		
		System.out.println(teste.tamanho());
		
		System.out.println(teste.tamanho(0));
		System.out.println(teste.estaVazio());
		
		System.out.println(teste.getElemento(0, 1));
		
		teste.removerElemento(0, 1);
		
		System.out.println(teste.estaVazio());
		
		teste.limpar();
	}

}
