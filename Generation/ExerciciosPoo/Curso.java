package exerciciosPoo;

public class Curso {
	
	public String nome;
	public String tipo;
	public String ead;
	public String duracao;
	public String certificado;
	public Curso(String nome, String tipo, String ead, String duracao, String certificado) {
		this.nome = nome;
		this.tipo = tipo;
		this.ead = ead;
		this.duracao = duracao;
		this.certificado = certificado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEad() {
		return ead;
	}
	public void setEad(String ead) {
		this.ead = ead;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	
	public void visualizar() {
		System.out.println("\n Nome do Curso: " + nome + "\n Tipo de Curso: " + tipo + "\n As aulas são ao vivo? " + ead + "\n Duração do Curso: " + duracao + "\n Possui Cerificado? " + certificado);
	}
	

}
