package exerciciosPoo;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia cliente1 = new Farmacia(" Amanda", " Rivotril", " Preta", " Cartela com 30 Comprimidos contendo 0,25mg cada", " SIM");
		cliente1.visualizar();
		
		Farmacia cliente2 = new Farmacia("Aline", "Dorflex", "Sem Tarja", "Cartela com 15 unidades", " Não precisa!");
		cliente2.visualizar();

	}

}
