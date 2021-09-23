package pedra_papel_tesoura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Jogo jogo1 = new Jogo();
		Random rand = new Random();
		
		int comp = rand.nextInt(3)+1;
		int player;
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Digite (1) para Pedra, (2) para Papel e (3) para Tesoura:");
			player = teclado.nextInt(4);
		} catch (Exception ex) {
			player=0;
		}
		
		jogo1.respostaPlayer(player);
		jogo1.respostaComp(comp);
		
		System.out.printf("Player escolheu %s\n", jogo1.getPlayer1());
		System.out.printf("Computador escolheu %s\n", jogo1.getComp1());
		
		System.out.printf("\n%s", jogo1.respostaFinal(comp, player));

	}

}
