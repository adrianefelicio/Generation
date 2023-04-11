package exerciciosPoo;

public class Farmacia {

	private String nomecliente;
	private String remedio;
	private String tarja;
	private String quantidade;
	private String receita;
	public Farmacia(String nomecliente, String remedio, String tarja, String quantidade, String receita) {
		this.nomecliente = nomecliente;
		this.remedio = remedio;
		this.tarja = tarja;
		this.quantidade = quantidade;
		this.receita = receita;
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getRemedio() {
		return remedio;
	}
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	public String getTarja() {
		return tarja;
	}
	public void setTarja(String tarja) {
		this.tarja = tarja;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	public void visualizar() {
		System.out.println("\n Nome do Cliente: " +nomecliente+ "\n Remédio: " + "\n Tipo de Tarja: " +tarja+ " \n Quantidade: " + "\n Possui Receita?: " +receita );
	}
}
