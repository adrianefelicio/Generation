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
		super.visualizar();
		System.out.println("\n Nome Fantasia da Empresa: " + nomeFantasia);
	}
}
