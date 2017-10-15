package lojaDepartamento;


public class VendaProduto {
	private Venda venda;
	private Produto produto;
	private float preco;
	private int quantidade;
	
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
		produto.getListaVendaProduto().add(this);
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
		this.getProduto().setQuantidade(this.getProduto().getQuantidade()-quantidade);
		if(this.getProduto().getQuantidade() < 0) {
			System.out.println("Sem estoque disponível de "+this.getProduto().getNome());
			this.quantidade = 0;
		}
	}
	
	public Cliente getCliente() {
		return this.venda.getCliente();
	}
	
	public Funcionario getFuncionario() {
		return this.venda.getFuncionario();
	}
	
}
