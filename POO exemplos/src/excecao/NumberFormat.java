package excecao;

public class NumberFormat {
	private String valor;
	private Integer inteiro;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getInteiro() {
		return inteiro;
	}

	private void setInteiro(Integer inteiro) {
		this.inteiro = inteiro;
	}

	public void Converter() {
		try {
			this.setInteiro(new Integer(valor));
		} catch (NumberFormatException ex) {
			System.out.println("Valor não permitido, inserir valor inteiro.");
		} 
	}
}
