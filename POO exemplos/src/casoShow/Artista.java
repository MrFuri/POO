package casoShow;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	private String nome;
	private String estiloMusical;
	private double valorCache;
	public List<Show> listaShowArt = null;
	
	public Artista() {
		this.listaShowArt = new ArrayList<Show>();
	}
	public Artista(String nome, String estilo) {
		this();
		this.nome = nome;
		this.estiloMusical = estilo;
	}
	
	public String getNomeArtista() {
		return this.nome;
	}
	
	public String getEstiloMusical() {
		return this.estiloMusical;
	}
	
	public double getValorCache() {
		return this.valorCache;
	}
	public void setValorCache(double valor) {
		this.valorCache = valor;
	}
	
	public List<Show> getListaShowArtby(){
		return this.listaShowArt;
	}
	public void AdListaShowArt(Show show) {
		this.listaShowArt.add(show);
	}
	
}
