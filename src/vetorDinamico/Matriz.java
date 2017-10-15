package vetorDinamico;

public class Matriz<T>{
	private int tamanho;
	private VetorDinamico<T>[] matriz = null;
	private int dimensao; 
	private VetorDinamico<T> vetor; 
	private T elemento;
	private int index;
	
	public Matriz() {
		this.setTamanho(10);
		this.matriz = new VetorDinamico[this.tamanho];
	}
	public Matriz(int tamanho) {
		this.setTamanho(tamanho);
		this.matriz = new VetorDinamico[tamanho];
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public VetorDinamico[] getMatriz() {
		return matriz;
	}
	public void setMatriz(VetorDinamico[] matriz) {
		this.matriz = matriz;
	}
	
	public int getDimencao() {
		return dimensao;
	}
	public void setDimencao(int dimencao) {
		this.dimensao = dimencao;
	}
	
	public T getElemento() {
		this.elemento = (T)this.vetor.getElemento();
		return this.elemento;
	}
	
	public void criarDimencao(int index, int tamanhoDimensao) {
		VetorDinamico<T> resize = new VetorDinamico<T>(tamanhoDimensao);
		this.matriz[index] = resize;
	}
	
	public void adicionarElemento(int dimensaoA, int dimensaoB, T elemento) {
		this.matriz[dimensaoA].Add(dimensaoB, elemento);
	}
	
	public void adicionarElemento(int dimensaoA, T elemento) {
		this.matriz[dimensaoA].Add(elemento);
	}
	
	public void removerElemento(int dimensaoA, int dimensaoB) {
		this.matriz[dimensaoA].remove(dimensaoB);
	}
	
	public void limpar() {
		for (int i = 0; i<this.matriz.length; i++) {
			this.matriz[i] = null;
		}
	}
	
	public boolean contem(int dimensaoA, T elemento) {
		if(this.matriz[dimensaoA].Contains(elemento)) {
			return true;
		}else
			return false;
	}
	
	public boolean contem(int dimensaoA, int dimensaoB, T elemento) {
		if(this.matriz[dimensaoA].Get(dimensaoB).equals(elemento))
			return true;
		else
			return false;
	}
	
	public boolean contem(T elemento) {
		for(int i = 0; i < this.matriz.length; i++) {
			if(this.matriz[i].Contains(elemento))
				return true;
		}
		return false;
	}
	
	public T getElemento(int dimensaoA, int dimensaoB) {
		return this.matriz[dimensaoA].Get(dimensaoB);
	}
	
	public VetorDinamico getElemento(int dimensaoA) {
		return this.matriz[dimensaoA];
	}
	
	public boolean estaVazio() {
		boolean aux = false;
		for(int i = 0; i < this.matriz.length; i++) {
			if(this.matriz[i]!=null) {
				aux = true;
			}
		}
		if(!aux)
			return true;
		else
			return false;
	}
	
	public boolean estaVazio(int dimensaoA) {
		if(this.matriz[dimensaoA].isEmpty())
			return true;
		else 
			return false;
	}
	
	public int tamanho() {
		int count = 0;
		for(int i = 0; i < this.matriz.length; i++) {
			count += this.matriz[i].size();
		}
		return count;
	}
	
	public int tamanho(int dimsensaoA) {
		return this.matriz[dimsensaoA].size();
	}

	
	
}
