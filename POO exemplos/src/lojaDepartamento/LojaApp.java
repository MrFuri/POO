package lojaDepartamento;

import java.time.LocalDate;
import java.util.List;

public class LojaApp {

	public static void main(String[] args) {
		Departamento vendas = new Departamento();
		vendas.setId(01);
		vendas.setNome("Vendas");
		vendas.setSigla("Vnd");
		
		Funcionario jefersson = new Funcionario("Jefersson", "1161125016", "1234");
		jefersson.setDepartamento(vendas);
		vendas.getListFuncionario().add(jefersson);
		
		Estado sergipe = new Estado(01, "Sergipe", "SE");
		
		Cidade aracaju = new Cidade(01, "Aracaju", sergipe);
		Cidade socorro = new Cidade(01, "Socorro", sergipe);
		
		Endereco aracaju1 = new Endereco(01, "Av. Saneamento", 741, "Luzia",
				"49045-285", aracaju);
		Endereco aracaju2 = new Endereco(02, "Beira Mar", 114, "13 de Julho",
				"49000-000", aracaju);
		Endereco socorro1 = new Endereco(01, "Av. Lacre", 285, "Poera", "49245-953", socorro);
		Endereco socorro2 = new Endereco(02, "Tampa", 03, "Pote", "48329-748", socorro);
		
		Cliente millana = new Cliente("Millana", "037.074.141-87");
		millana.setEndereco(aracaju1);
		Cliente andre = new Cliente("André", "074.716.065-17");
		andre.setEndereco(aracaju2);
		Cliente lisandra = new Cliente("Lisandra", "021.859.685-56");
		lisandra.setEndereco(socorro1);
		Cliente julia = new Cliente("Julia", "012.345.678-99");
		julia.setEndereco(socorro2);
		
		Produto bombril = new Produto();
		bombril.setId(01);
		bombril.setNome("Bombril");
		bombril.setPreco(5.55f);
		bombril.setQuantidade(5);
		bombril.setProdutoOriginal(bombril);
		
		Produto assolan = new Produto();
		assolan.setId(02);
		assolan.setNome("Assolan");
		assolan.setPreco(4.70f);
		assolan.setQuantidade(7);
		assolan.setProdutoOriginal(bombril);
		
		Produto ype = new Produto();
		ype.setId(03);
		ype.setNome("Ypê");
		ype.setPreco(4.20f);
		ype.setQuantidade(15);
		ype.setProdutoOriginal(bombril);
		
		bombril.CadastrarSimilarProduto(assolan);
		bombril.CadastrarSimilarProduto(ype);
		assolan.CadastrarSimilarProduto(ype);
		assolan.CadastrarSimilarProduto(bombril);
		ype.CadastrarSimilarProduto(assolan);
		ype.CadastrarSimilarProduto(bombril);
		
		bombril.ExcluirSimilarProduto(ype);
		assolan.ExcluirSimilarProduto(ype);

		aracaju.getListaEndereco().add(aracaju1);
		aracaju.getListaEndereco().add(aracaju2);
		socorro.getListaEndereco().add(socorro1);
		socorro.getListaEndereco().add(socorro2);
		
		sergipe.getListaCidade().add(aracaju);
		sergipe.getListaCidade().add(socorro);
		
		
		Venda venda1 = new Venda(01, LocalDate.now());
		venda1.setCliente(millana);
		venda1.setFuncionario(jefersson);
		venda1.adicionarProduto(bombril, 5, 0);
		venda1.adicionarProduto(assolan, 8, 10); /*<-aqui coloco uma quantidade que não tem 
		disponível no estoque, então o programa informa e não o conta na venda*/
		venda1.adicionarProduto(ype, 10, 20);
		venda1.finalizarVenda();
		
		//aqui ype nao aparece pq foi excluido dos similares de todos que estao na venda
		System.out.println("\n\nTodos os produtos similares aos da venda: ");
		List<Produto> similares = venda1.obterProdutosSimilares();
		for(Produto x : similares) {
			System.out.println(x.getNome());
		}
		
		System.out.println("\n\nTodos os produtos destaques (produto original):");
		List<Produto> destaques = venda1.obterProdutosDestaques();
		for(Produto x : destaques) {
			System.out.println(x.getNome());
		}
		
		System.out.println("\nQuantidade de vendas de bombril: "+bombril.getQuantidadeVendas());
		
		System.out.printf("\nTotal arrecado da venda de bombril: %.2f",bombril.getTotalArrecadadoVenda());
		
		System.out.println("\n\nLista de cidades de clientes que compraram bombril:");
		List<Cidade> cidades = bombril.getListaCidadeClientes();
		for(Cidade x : cidades) {
			System.out.println(x.getNome());
		}
		
		venda1.removerProduto(03);
		System.out.println();
		venda1.finalizarVenda();
		
		
	}

}
