package exerciciosPoo;

public class Clientes {
	
	private String nome;
	private String genero;
	private int idade;
	private String endereco;
	private String contaTipo;
	public Clientes(String nome, String genero, int idade, String endereco, String contaTipo) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.endereco = endereco;
		this.contaTipo = contaTipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getContaTipo() {
		return contaTipo;
	}
	public void setContaTipo(String contaTipo) {
		this.contaTipo = contaTipo;
	}
	
	public void visualizar() {
		
		System.out.println("\n Cliente " + nome + "\n genero: " + genero + " residente do endereço: " + endereco + " possui uma conta: " + contaTipo);
		
	}
	

}
