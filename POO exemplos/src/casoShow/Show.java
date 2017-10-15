package casoShow;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Show {
	private String titulo; //titulo do show
	private LocalDate data; //Data de realização do show
	private EmpresaEventos empresaEvento; //Empresa de Eventos organizadora
	private Cidade cidade; //Cidade do show
	public List<Artista> listaArtista = null;
	
	public Show() {
		this.listaArtista = new ArrayList<Artista>();
	}
	
	public Show(String titulo, LocalDate data) {
		this();
		this.titulo = titulo;
		this.data = data;
	}
	
	public Show(String titulo, LocalDate data, Cidade cidade) {
		this(titulo, data);
		this.cidade = cidade;
	}
	
	
	public void AdicionarArtista(Artista artista) {
		this.listaArtista.add(artista);
	}
	
	public double getValorShow() {
		double valor=0;
		for(Artista i : listaArtista) {
			valor += i.getValorCache();
		}
		return valor;
	}

	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String nome) {
		this.titulo = nome;
	}
	
	public LocalDate getData(){
		return this.data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public EmpresaEventos getEmpresa() {
		return this.empresaEvento;
	}
	public void setEmpresa(EmpresaEventos nome) {
		this.empresaEvento = nome;
	}
	
	public Cidade getCidade() {
		return this.cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public List<Artista> getListaArtista(){
		return this.listaArtista;
	}
	
}
