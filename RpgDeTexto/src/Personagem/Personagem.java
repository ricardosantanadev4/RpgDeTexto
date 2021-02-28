package Personagem;

public abstract class Personagem {
	// Atributos
	private String nome;
	private String raca;
	private String armaAtac;
	private String armaDefesa;
	private double vida;
	private double danoArma;
	private double curaVida;
	private int porcao;
	
	// Métodos abstratos	
	public abstract void criarPersonagem(String nome);
	public abstract void statusPersonagem();
	public abstract void danoPersonagem();
	public abstract void curaPersonagem();
	
	// Métodos especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getArmaAtac() {
		return armaAtac;
	}
	public void setArmaAtac(String armaAtac) {
		this.armaAtac = armaAtac;
	}
	public String getArmaDefesa() {
		return armaDefesa;
	}
	public void setArmaDefesa(String armaDefesa) {
		this.armaDefesa = armaDefesa;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public double getDanoArma() {
		return danoArma;
	}
	public void setDanoArma(double danoArma) {
		this.danoArma = danoArma;
	}
	public double getCuraVida() {
		return curaVida;
	}
	public void setCuraVida(double curaVida) {
		this.curaVida = curaVida;
	}
	public int getPorcao() {
		return porcao;
	}
	public void setPorcao(int porcao) {
		this.porcao = porcao;
	}
	
	
}
