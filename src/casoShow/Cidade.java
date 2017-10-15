package casoShow;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cidade {
	private int codigo; //id da cidade
	private String nome; //nome da cidade
	public Estado estado; //estado da cidade
	public List<Show> listaShow = null;
	
	
	//construtor
	
	public Cidade() {
		this.listaShow = new ArrayList<Show>();
	}
	public Cidade(int codigo, String nome) {
		this();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Cidade(int codigo, String nome, Estado estado) {
		this(codigo, nome);
		this.estado = estado;
	}

	//GET - SET
	public int getCodigoCidade() {
		return this.codigo;
	}
	public void setCodigoCidade(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNomeCidade() {
		return this.nome;
	}
	public void setNomeCidade(String nome) {
		this.nome = nome;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	public void setEstado(Estado nome) {
		this.estado = nome;
	}
	
	public void AdicionarShow(Show show) {
		this.listaShow.add(show);
	}
	
	public List<Show> ObterShowsRealizados(){
		List<Show> listaShowRealizado = new ArrayList<Show>();
		LocalDate local  = LocalDate.now();
		for(Show i : listaShow) {
			if(i.getData().isBefore(local)) {
				listaShowRealizado.add(i);
			}
		}
		return listaShowRealizado;
	}
	
	public List<Show> ObterShowsAgendados(){
		final List<Show> listaShowAgendado = new ArrayList<Show>();
		final LocalDate local = LocalDate.now();
		for(Show i : listaShow) {
			if(i.getData().isAfter(local)) {
				listaShowAgendado.add(i);
			}
		}
		return listaShowAgendado;
	}
	
	public double ObterTotalGastoShows() {
		List<Show> lista = new ArrayList<Show>();
		double valor = 0;
		lista = this.ObterShowsRealizados();
		for(Show i : lista) {
			valor += i.getValorShow();
		}
		return valor;
	}
	
	
	
}
