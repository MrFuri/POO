package vetorDinamico;

import java.util.Iterator;

public class VetorDinamico<T> implements Iterable<T> {
	private int tamanho;
	private T[] vetor = null;
	private T elemento;
	private int index;

	public VetorDinamico() {

		this.setTamanho(15);
		this.vetor = (T[]) new Object[this.tamanho];
	}

	public VetorDinamico(int tamanho) {
		this.setTamanho(tamanho);
		this.vetor = (T[]) new Object[this.tamanho];
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public T[] getVetor() {
		return vetor;
	}

	public void setVetor(T[] vetor) {
		this.vetor = vetor;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean Add(T elemento) {
		this.setElemento(elemento);
		T[] duplicado = (T[]) new Object[(this.tamanho) * 2];
		boolean isFull = true;
		for (T x : this.vetor) {
			if (x == null) {
				isFull = false;
				break;
			}
		}

		if (!isFull) {
			for (int i = 0; i < this.vetor.length; i++) {
				if (this.vetor[i] == null) {
					this.vetor[i] = elemento;
					return true;
				}
			}
		}
		if (isFull) {
			duplicado = this.vetor.clone();
			for (int i = 0; i < duplicado.length; i++) {
				if (this.vetor[i] == null)
					this.vetor[i] = elemento;
			}
			this.setVetor(duplicado);
		}
		return false;
	}

	public void Add(int index, T element) {
		this.setIndex(index);
		this.setElemento(element);
		this.vetor[this.index] = this.elemento;
	}

	public void Clear() {
		for (int i = 0; i < this.vetor.length; i++) {
			this.vetor[i] = null;
		}
	}

	public boolean Contains(T elemento) {
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}

	public T Get(int index) {
		this.setIndex(index);
		if(((index+1) > this.vetor.length)||index<0) {
			throw new ArrayIndexOutOfBoundsException("Index não existe.");
		}
		return this.vetor[this.index];
	}

	public int IndexOf(T elemento) {
		this.setElemento(elemento);
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i].equals(this.elemento)) {
				return i;
			}
		}
		return 666666666;
	}

	public boolean isEmpty() {
		int qtdnull = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] == null)
				qtdnull++;
		}
		if (qtdnull == this.vetor.length)
			return true;
		else
			return false;
	}

	public int lastIndexOf(T elemento) {
		for (int i = this.vetor.length; i > 0; i--) {
			if (this.vetor[i] == elemento)
				return i;
		}
		return 0;
	}

	public void remove(int index) {
		this.vetor[index] = null;
		T[] reduzido = (T[]) new Object[(this.tamanho) - 1];
		for (int i = 0, j = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] != null) {
				reduzido[j] = this.vetor[i];
				j++;
			}
		}
		this.setVetor(reduzido);
	}

	public int size() {
		int count = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] != null)
				count++;
		}
		return count;
	}

	public void resize(int length) {
		T[] resize = (T[]) new Object[length];
		for (int i = 0; i < resize.length; i++) {
			resize[i] = this.vetor[i];
		}
		this.setVetor(resize);
	}

	@Override
	public Iterator<T> iterator() {

		Iterator<T> it = new Iterator<T>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < vetor.length && vetor[currentIndex] != null;
			}

			@Override
			public T next() {
				return vetor[currentIndex++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;

	}
}
