package Personagem;

public class Monstro extends Personagem {

	@Override
	public void criarPersonagem(String nome) {
		this.setNome(nome);
		this.setRaca("Monstro");
		this.setArmaAtac("Garras");
		this.setArmaDefesa("Garras defencivas");
		this.setVida(100);
		this.setDanoArma(5);
		this.setCuraVida(2);			
	    this.setPorcao(0);		
	}

	@Override
	public void statusPersonagem() {
		System.out.println("Status do personagem:");
		System.out.println("Nome " + this.getNome());
		System.out.println("Raca " + this.getRaca());
	    System.out.println("Arma de ataque " + this.getArmaAtac());
	    System.out.println("Arma de defesa " + this.getArmaDefesa());
	    System.out.println("Vida " + this.getVida());
	    System.out.println("Ao atacar com as " + getArmaAtac()
	    + " é causado um dano de -" + this.getDanoArma() + " no adversário");
	    System.out.println("Porcentagem de cura por porção + " + this.getCuraVida());
	    System.out.println("Quantidade de porções de cura " + this.getPorcao());		
	}

	@Override
	public void danoPersonagem() {
		this.setVida(getVida() - getDanoArma());
		System.out.println("Você errou!");
		System.out.println("Acaba de receber um dano de -" + getDanoArma());
		System.out.println("Vida = a " + getVida());		
	}

	@Override
	public void curaPersonagem() {if (this.getPorcao() == 0) {
		System.out.println("Porções insuficiente!");
	} else if (this.getPorcao() >= 1 && this.getPorcao() < 100) {
		this.setPorcao(this.getPorcao() - 1);
		System.out.println("Você acaba de usar uma porção de cura. Quantidade de Porções = " + this.getPorcao());
		this.setVida(this.getVida() + this.getCuraVida());
		System.out.println("Sua vida " + this.getVida());
	}
		
	}

	

}
