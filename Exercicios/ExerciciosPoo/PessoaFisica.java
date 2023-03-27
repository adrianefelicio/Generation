package exerciciosPoo;

public class PessoaFisica extends Clientes {
	
	private String impostoRenda;

	public PessoaFisica(String nome, String genero, int idade, String endereco, String contaTipo, String impostoRenda) {
		super(nome, genero, idade, endereco, contaTipo);
		this.impostoRenda = impostoRenda;
	}

	public String getImpostoRenda() {
		return impostoRenda;
	}

	public void setImpostoRenda(String impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	
	public void validarIR() {
		if (getImpostoRenda().length()!=12) {
			System.out.println("\n Imposto de Renda Inválido!");
		} else {
			System.out.println("\n Imposto de Renda Válido!");
		}
		

	}
	public void visualizar() {
		System.out.println("\n Nome do Cliente " + getNome() + "\n Gênero: " + getGenero() + "\n Idade: " + getIdade() + "\n Endereço" + getEndereco() + "\n Tipo de Conta:" + getContaTipo() + "\n Dados do Imposto de Renda: " + impostoRenda);
	}
}
