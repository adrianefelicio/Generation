package exerciciosPoo;

public class TestaCliente {

	public static void main(String[] args) {
		

		PessoaFisica cliente1 = new PessoaFisica("Amanda", "F", 25, "Rua das Flores, Jardim, SP", "Física" , "123456789012");
		cliente1.visualizar();
		
		PessoaFisica cliente2 = new PessoaFisica("Aline", "F", 42, "Rua Alameda Itupiranga, Ipiranga, SP", "Física", "32165498712");
		cliente2.visualizar();
		
		PessoaJuridica cliente3 = new PessoaJuridica("Roberto", "M", 35, "Rua das Pedras, Limoeiro, SP", "Jurídica" , "Escritorio de Advocacia Roberto");
		cliente3.visualizar();

		PessoaJuridica cliente4 = new PessoaJuridica ("Felipe", "M", 27, "Rua Canadá, Cibratel, SP" , "Jurídica", "Empório Mineiro" );
		cliente4.visualizar();
	}

}
