package vetorDinamico;

public class VetorDinamicoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VetorDinamico<Integer> vetor = new VetorDinamico<Integer>(10);
		vetor.Add(15);
		vetor.Add(1);
		vetor.Add(4668);
		vetor.Add(70);
		vetor.Add(3);
		vetor.Add(18);
		vetor.Add(954);
		vetor.Add(13);
		System.out.printf("Posição do elemento no vetor: "+vetor.IndexOf(4668));
		
		System.out.println("\nNúmero na posição 0: "+vetor.Get(100));
		System.out.println("\nLista de vetor: ");
		for(Integer x : vetor) {
			//if(x!=null)
				System.out.printf(x+"\t");
		}
		vetor.remove(2);
		System.out.println("\nLista de vetor com index 2 removido: ");
		for(Integer x : vetor) {
			//if(x!=null)
				System.out.printf(x+"\t");
		}
		System.out.printf("\n\nSe contem 15: %b",vetor.Contains(15));
		System.out.printf("\nTamanho do vetor: %d",vetor.size() );
		vetor.resize(5);
		System.out.println("\nLista de vetor com resize para 5: ");
		for(Integer x : vetor) {
			//if(x!=null)
				System.out.printf(x+"\t");
		}

		vetor.Clear();
		System.out.println("\n\nLista Vazia: ");
		for(Integer x : vetor) {
			System.out.printf(x+"\t");
		}
		
		
		System.out.printf("\nSe o vetor esta vazio: "+vetor.isEmpty());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
