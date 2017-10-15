package casoShow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpresaEventos {
	private String nome; // nome da empresa
	private List<Artista> ListaArtista = null;
	private List<Show> ListaShow = null;

	public EmpresaEventos() {
		this.ListaArtista = new ArrayList<Artista>();
		this.ListaShow = new ArrayList<Show>();
	}

	public EmpresaEventos(String nome) {
		this();
		this.nome = nome;
	}

	public EmpresaEventos(String nome, List<Artista> listaArtista, List<Show> listaShow) {
		this(nome);
		this.ListaArtista = listaArtista;
		this.ListaShow = listaShow;
	}

	public String getNomeEmpresa() {
		return this.nome;
	}

	public void setNomeEmpresa(String nome) {
		this.nome = nome;
	}

	public List<Artista> getListaArtista() {
		return this.ListaArtista;
	}

	public void AdicionarArtista(Artista artista) {
		this.ListaArtista.add(artista);
	}

	public List<Show> getListaShow() {
		return this.ListaShow;
	}

	public void AdicionarShow(Show show) {
		this.ListaShow.add(show);
	}

	public void listarArtistasShow(String nomeArtista, LocalDate dataInicio, LocalDate dataFim) {
		List<Artista> lista = new ArrayList<Artista>();
		for (Show i : ListaShow) {
			if (i.getData().isAfter(dataInicio) && i.getData().isBefore(dataFim)) {
				for (Artista x : i.listaArtista) {
					if (x.getNomeArtista().equalsIgnoreCase(nomeArtista))
						lista.add(x);
				}
			}
		}
		for (Artista x : lista) {
			System.out.println("Artista: " + x.getNomeArtista());
		}
	}

	public void listarTopCidadeShow() {
		int count = 0;
		int maior = 0;
		double valortotal = 0;
		String nome = null;
		List<Cidade> cidades = new ArrayList<Cidade>();

		for (Show show : ListaShow) {
			cidades.add(show.getCidade());
		}

		for (Cidade x : cidades) {
			count = Collections.frequency(cidades, x);
			if (count > maior) {
				maior = count;
				nome = x.getNomeCidade();
			}
		}

		for (Show i : ListaShow) {
			if (i.getCidade().getNomeCidade() == nome) {
				valortotal += i.getValorShow();
			}
		}
		System.out.println(nome + " foi a cidade com o maior número de show(s). Foram " + maior
				+ " show(s) que custaram R$ " + valortotal);
	}

	public void listarTopCidadeValorShow() {
		double valor = 0;
		String cidade = null;
		for (Show i : ListaShow) {
			double soma = 0;
			for (Show j : ListaShow) {
				if (i.getCidade().equals(j.getCidade())) {
					soma += j.getValorShow();
				}
			}
			if (soma > valor) {
				valor = soma;
				cidade = i.getCidade().getNomeCidade();
			}
		}
		System.out.println(cidade + " foi a cidade que mais investiu em show(s). A cidade investiu R$ " + valor);
	}

}
