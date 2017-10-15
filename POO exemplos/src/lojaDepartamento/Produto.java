package lojaDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private float preco;
	private int quantidade;
	private List<Produto> listaSimilar = null;
	private Produto produtoOriginal;
	private List<VendaProduto> listaVendaProduto = null;
	
	public Produto() {
		listaSimilar = new ArrayList<Produto>();
		listaVendaProduto = new ArrayList<VendaProduto>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public List<Produto> getListaSimilar() {
		return listaSimilar;
	}
	public void setListaSimilar(List<Produto> listaSimilar) {
		this.listaSimilar = listaSimilar;
	}
	
	public Produto getProdutoOriginal() {
		return produtoOriginal;
	}
	public void setProdutoOriginal(Produto produtoOriginal) {
		this.produtoOriginal = produtoOriginal;
	}
	public List<VendaProduto> getListaVendaProduto() {
		return listaVendaProduto;
	}
	public void setListaVendaProduto(List<VendaProduto> listaVendaProduto) {
		this.listaVendaProduto = listaVendaProduto;
	}
	public void AddListaVendaProduto(VendaProduto vendaProduto) {
		this.listaVendaProduto.add(vendaProduto);
	}
	
	public int getQuantidadeVendas() {
		int count = 0;
		for(VendaProduto x : listaVendaProduto) {
			count = x.getQuantidade();
		}
		return count;
	}
	
	public float getTotalArrecadadoVenda() {
		float valor = 0;
		for(VendaProduto x : listaVendaProduto) {
		valor += x.getPreco(); 
		}
		return valor;
	}
	
	public List<Cidade> getListaCidadeClientes(){
		List<Cidade> listaCidades = new ArrayList<Cidade>();
		for(VendaProduto x : listaVendaProduto) {
			listaCidades.add(x.getVenda().getCliente().getEndereco().getCidade());
		}
		return listaCidades;
	}
	
	public void CadastrarSimilarProduto(Produto produto) {
		listaSimilar.add(produto);
	}
	
	public void ExcluirSimilarProduto(Produto produto) {
		listaSimilar.remove(produto);
	}
	
	public boolean ehProdutoMarca() {
		if(this.getId()==this.produtoOriginal.getId()) {
			return true;
		}else
			return false;
	}
	
	public boolean ehProdutoSimilar() {
		for(Produto x : listaSimilar) {
			if(x.getId() == this.getId()) {
				return true;
			} 
		}
		return false;
	}
	
	
	
	
}
