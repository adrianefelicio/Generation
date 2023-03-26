package exerciciosPoo;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cargo;
	private String unidade;
	private String salario;
	public Funcionario(String nome, int idade, String cargo, String unidade, String salario) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.unidade = unidade;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}

	
	public void visualizar() {
		System.out.printf("\n Funcionário: " + nome + " \n idade: " + idade + "\n cargo: " + cargo + "\n trabalha na unidade: " + unidade + "\n salário: R$ " + salario);
	}

	
}