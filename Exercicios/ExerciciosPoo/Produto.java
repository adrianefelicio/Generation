package exerciciosPoo;

public class Produto {
	
	public String playstation;
	public String xbox;
	public String jogos;
	public String acessorios;
	public String cadeiras;
	public Produto(String playstation, String xbox, String jogos, String acessorios, String cadeiras) {
		this.playstation = playstation;
		this.xbox = xbox;
		this.jogos = jogos;
		this.acessorios = acessorios;
		this.cadeiras = cadeiras;
	}
	public String getPlaystation() {
		return playstation;
	}
	public void setPlaystation(String playstation) {
		this.playstation = playstation;
	}
	public String getXbox() {
		return xbox;
	}
	public void setXbox(String xbox) {
		this.xbox = xbox;
	}
	public String getJogos() {
		return jogos;
	}
	public void setJogos(String jogos) {
		this.jogos = jogos;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	public String getCadeiras() {
		return cadeiras;
	}
	public void setCadeiras(String cadeiras) {
		this.cadeiras = cadeiras;
	}
	public void visualizar() {
		System.out.println("\n Console da Sony: " + playstation + "\n Console da XBOX: " + xbox + "\n Jogo(s) escolhido(s): " + jogos + "\n Acessório(s) escolhido(s): " + acessorios + "Cadeira Gamer escolhida: " + cadeiras);
	}
}
