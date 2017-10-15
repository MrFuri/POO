package casoShow;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private int codigo; //codigo do Estado
	private String nome; //nome do Estado
	private String sigla; //sigla do Estado
	public List<Cidade> listaCidade = null;
	
	public Estado() {
		this.listaCidade = new ArrayList<Cidade>();
	}
	public Estado(int codigo, String nome, String sigla) {
		this();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	//GET-SET
	public int getCodigoEstado() {
		return this.codigo;
	}
	public void setCodigoEstado(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNomeEstado() {
		return this.nome;
	}
	public void setNomeEstado(String nome) {
		this.nome = nome;
	}
	
	public String getSiglaEstado() {
		return this.sigla;
	}
	public void setSiglaEstado(String sigla) {
		this.sigla = sigla;
	}

	public Cidade obterCidade(int codigo) {
		for(Cidade i : this.listaCidade) {
			if(i.getCodigoCidade()==codigo) {
				return i;
			}
		}return null;
	}
	public void adicionarCidade(Cidade cidade) {
		this.listaCidade.add(cidade);
	}
	
}
