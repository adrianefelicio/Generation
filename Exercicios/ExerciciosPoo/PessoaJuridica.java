package exerciciosPoo;

public class PessoaJuridica extends Clientes {

	public String nomeFantasia;

	public PessoaJuridica(String nome, String genero, int idade, String endereco, String contaTipo,
			String nomeFantasia) {
		super(nome, genero, idade, endereco, contaTipo);
		this.nomeFantasia = nomeFantasia;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	public void visualizar() {
		System.out.println("\n Nome do Cliente: " + getNome() + "\n Gênero: " + getGenero() + "\n Idade: " + getIdade() + "\n Endereço: " + getEndereco() + "\n Tipo de Conta: " + getContaTipo() + "\n Nome Fantasia Da Empresa: " + nomeFantasia);
	}
}
