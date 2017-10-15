package time;

public class Time {

	private String nomeTime;
	private String estadoTime;

	// Construtor

	public Time(String nome, String estado) {
		this.setNomeTime(nome);
		this.setEstadoTime(estado);
	}

	// GET - SET
	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getEstadoTime() {
		return estadoTime;
	}

	public void setEstadoTime(String estadoTime) {
		this.estadoTime = estadoTime;
	}

	/*public List<Time> getListaTime() {
		return this.listaTime;
	}*/

	/*public void setListaTime(List<Time> listaClube) {
		this.listaTime = listaClube;
	}*/

	// Métodos
	public void alterarNome(String novoNome) {
		this.nomeTime = novoNome;
	}

	public void alterarEstado(String novoEstado) {
		this.estadoTime = novoEstado;
	}

}
