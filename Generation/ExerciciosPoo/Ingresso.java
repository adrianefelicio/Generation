package exerciciosPoo;

public class Ingresso {
	
	public String evento;
	public String artista;
	public String tipodeingresso;
	public String tipodepista;
	public String data;
	public Ingresso(String evento, String artista, String tipodeingresso, String tipodepista, String data) {
		this.evento = evento;
		this.artista = artista;
		this.tipodeingresso = tipodeingresso;
		this.tipodepista = tipodepista;
		this.data = data;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTipodeingresso() {
		return tipodeingresso;
	}
	public void setTipodeingresso(String tipodeingresso) {
		this.tipodeingresso = tipodeingresso;
	}
	public String getTipodepista() {
		return tipodepista;
	}
	public void setTipodepista(String tipodepista) {
		this.tipodepista = tipodepista;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void visualizar() {
		System.out.println("\n Nome do Evento: " + evento + "\n Nome do Artista: " + artista + "\n O ingresso é meia ou inteira? " + tipodeingresso + "\n Tipo de Pista: " + tipodepista + "\n Data do Evento: " + data);
	}
	
	
	
	

}
