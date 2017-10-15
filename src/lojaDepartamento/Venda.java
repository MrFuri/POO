package lojaDepartamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private int codigo;
	private LocalDate data;
	private float precoTotal;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<VendaProduto> listaVendaProduto = null;

	public Venda() {
		setListaVendaProduto(new ArrayList<VendaProduto>());
	}

	public Venda(int codigo, LocalDate data) {
		this();
		this.setCodigo(codigo);
		this.setData(data);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<VendaProduto> getListaVendaProduto() {
		return listaVendaProduto;
	}

	public void setListaVendaProduto(List<VendaProduto> listaVendaProduto) {
		this.listaVendaProduto = listaVendaProduto;
	}

	public void finalizarVenda() {
		System.out.printf("\nVenda Finalizada");
		for (VendaProduto i : listaVendaProduto) {
			System.out.print(String.format("\nProduto: %-20s    R$ %.2f", i.getProduto().getNome(), i.getPreco()));
		}
	}

	public void removerProduto(int prodtId) {
		for (VendaProduto x : listaVendaProduto) {
			if (x.getProduto().getId() == prodtId) {
				listaVendaProduto.remove(x);
				break;
			}
		}
	}

	public void removerProduto(VendaProduto produto) {
		listaVendaProduto.remove(produto);
	}

	public List<Produto> obterProdutosSimilares() {
		List<Produto> listaaux = new ArrayList<Produto>();
		List<Produto> listaSimilares = new ArrayList<Produto>();
		for (VendaProduto x : listaVendaProduto) {
			listaaux.addAll(x.getProduto().getListaSimilar());
		}
		for (Produto x : listaaux) {
			if (!listaSimilares.contains(x))
				listaSimilares.add(x);
		}
		return listaSimilares;
	}

	public List<Produto> obterProdutosDestaques() {
		List<Produto> aux = new ArrayList<Produto>();
		List<Produto> original = new ArrayList<Produto>();
		for (VendaProduto x : listaVendaProduto) {
			if (x.getProduto().ehProdutoMarca())
				aux.add(x.getProduto());
		}
		for (Produto x : aux) {
			if (!original.contains(x))
				original.add(x);
		}
		return original;
	}

	public void adicionarProduto(Produto produto, int quantidade, float desconto) {
		VendaProduto x = new VendaProduto();
		x.setProduto(produto);
		x.setQuantidade(quantidade);
		x.setPreco(x.getQuantidade() * (produto.getPreco() - (produto.getPreco()) * (desconto / 100)));
		if (x.getQuantidade() > 0)
			this.listaVendaProduto.add(x);
		x.setVenda(this);
	}

}
