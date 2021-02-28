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
	    + " � causado um dano de -" + this.getDanoArma() + " no advers�rio");
	    System.out.println("Porcentagem de cura por por��o + " + this.getCuraVida());
	    System.out.println("Quantidade de por��es de cura " + this.getPorcao());		
	}

	@Override
	public void danoPersonagem() {
		this.setVida(getVida() - getDanoArma());
		System.out.println("Voc� errou!");
		System.out.println("Acaba de receber um dano de -" + getDanoArma());
		System.out.println("Vida = a " + getVida());		
	}

	@Override
	public void curaPersonagem() {if (this.getPorcao() == 0) {
		System.out.println("Por��es insuficiente!");
	} else if (this.getPorcao() >= 1 && this.getPorcao() < 100) {
		this.setPorcao(this.getPorcao() - 1);
		System.out.println("Voc� acaba de usar uma por��o de cura. Quantidade de Por��es = " + this.getPorcao());
		this.setVida(this.getVida() + this.getCuraVida());
		System.out.println("Sua vida " + this.getVida());
	}
		
	}

	

}
