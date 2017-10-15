package casoShow;

import java.time.LocalDate;

public class ShowApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estado sergipe = new Estado(01, "Sergipe", "SE");
		
		Cidade aracaju = new Cidade(01, "Aracaju", sergipe);
		
		Show odonto = new Show("Odonto Fantasy", LocalDate.of(2017, 06, 21), aracaju);
		odonto.setCidade(aracaju);
		
		EmpresaEventos ja = new EmpresaEventos("João Alves");
		
		Artista avioes = new Artista("Aviões do Forró", "Forró");
		Artista natroots = new Artista("Natroots", "Reggae");
		
		aracaju.AdicionarShow(odonto);
		
		avioes.setValorCache(5500);
		avioes.AdListaShowArt(odonto);
		
		natroots.setValorCache(12000);
		natroots.AdListaShowArt(odonto);
		
		odonto.setEmpresa(ja);
		odonto.AdicionarArtista(natroots);
		odonto.AdicionarArtista(avioes);
		odonto.getCidade();
		
		ja.AdicionarArtista(natroots);
		ja.AdicionarArtista(avioes);
		ja.AdicionarShow(odonto);
		
		System.out.println(aracaju.ObterTotalGastoShows());
		ja.listarTopCidadeShow();
		ja.listarTopCidadeValorShow();
		ja.listarArtistasShow("natroots", LocalDate.of(2017, 02, 13), LocalDate.of(2018, 06, 13));
	}

}
