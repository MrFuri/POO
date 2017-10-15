package empresa;

public class Empregados {
	private String empregado;
	private String departamento;
	private int hrsMes;
	private float salHrs;
	private float salarioMensal;

	// Construtor
	Empregados(String nome, String dp) {
		setEmpregado(nome);
		setDepartamento(dp);
	}

	// GET - SET

	public String getEmpregado() {
		return this.empregado;
	}

	public void setEmpregado(String nome) {
		this.empregado = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String nome) {
		this.departamento = nome;
	}

	public int getHrsMes() {
		return this.hrsMes;
	}

	public void setHrsMes(int horas) {
		this.hrsMes = horas;
	}

	public float getSalHrs() {
		return this.salHrs;
	}

	public void setSalHrs(float salarioHora) {
		this.salHrs = salarioHora;
	}

	public float getSalarioMensal() {
		return this.salarioMensal;
	}

	// Métodos
	
	public void MostrarDados() {
		System.out.println(String.format("Funcionário   : %s", this.getEmpregado()));
		System.out.println(String.format("Departamento  : %s", this.getDepartamento()));
		System.out.println(String.format("Horas/Mês     : %s", this.getHrsMes()));
		System.out.println(String.format("Sal/Hora      : %s", this.getSalHrs()));
		System.out.println(String.format("Salário Mensal: %s", this.getSalarioMensal()));
		System.out.println();
	}

	public void calculaSalarioMensal() {
		if (this.departamento.equals("Diretoria")) {
			this.salarioMensal = (this.getSalHrs() * this.getHrsMes()) * 1.1f;
		} else
			this.salarioMensal = this.getSalHrs() * this.getHrsMes();
	}
	
}
