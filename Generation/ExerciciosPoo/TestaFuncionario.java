package exerciciosPoo;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario num1 = new Funcionario ("Analia", 58, " Desenvolvedora Sênior ", " São Paulo ", "15.000" );
		num1.visualizar();
		
		System.out.println("\n ");
		
		Funcionario num2 = new Funcionario ("Miguel", 53, "Gerente de RH", " São Paulo ", "12.000" );
		num2.visualizar();
	}
	
	
}
