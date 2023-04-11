package exerciciosPoo;

public class TestaIngresso {

	public static void main(String[] args) {
	
		Ingresso evento1 = new Ingresso ("Show de Comédia", "Alessandro Berle", "Inteira", "plateia", "25/05/2023");
		evento1.visualizar();
		
		Ingresso evento2 = new Ingresso ("Show de Música", "The Killers", "Meia", "Arquibancada", "03/05/2023");
		evento2.visualizar();

	}

}
