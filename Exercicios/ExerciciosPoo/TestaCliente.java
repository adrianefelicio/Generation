package exerciciosPoo;

public class TestaCliente {

	public static void main(String[] args) {
		

		PessoaFisica cliente1 = new PessoaFisica("Amanda", "F", 25, "Rua das Flores, Jardim, SP", "Física" , "123456789012");
		cliente1.visualizar();
		
		PessoaJuridica cliente2 = new PessoaJuridica("Roberto", "M", 35, "Rua das Pedras, Limoeiro, SP", "Jurídica" , "");
		cliente2.visualizar();
	
	}

}
