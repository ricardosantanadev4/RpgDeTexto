package Personagem;

import java.util.Scanner;

public class RpgMain {

	public static void main(String[] args) {
		// Código interface do jogo
		System.out.println("Iniciando jogo RPG de Texto... \n"
		+ " \n" + "1-HUMANO \n2-MONSTRO");
		Scanner entradaUserInt = new Scanner(System.in);
		int opcao = entradaUserInt.nextInt();
		if (opcao != 1 && opcao != 2) {
			System.out.println("Opção inválida!");
		} else if (opcao == 1) {
			System.out.println("Informe o nome do Personagem: ");
			Scanner entradaUserString = new Scanner(System.in);
			String personagem = entradaUserString.nextLine();
			Humano humano = new Humano();
			humano.criarPersonagem(personagem);
			humano.statusPersonagem();
			humano.danoPersonagem();
			humano.curaPersonagem();
		}
		else {
			System.out.println("Informe o nome do Personagem: ");
			Scanner entradaUserString = new Scanner(System.in);
			String personagem = entradaUserString.nextLine();
			Monstro monstro = new Monstro();
			monstro.criarPersonagem(personagem);
			monstro.statusPersonagem();
			monstro.danoPersonagem();
			monstro.curaPersonagem();
		}

	}

}
