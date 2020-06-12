package jogovelha;

import java.util.Scanner;

public class JogoVelha {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
		Tabuleiro jogo = new Tabuleiro();
		String posicao;
		int valida = 0, Jogadas = 0;
		
		while(true) {
			System.out.println("============ Bem Vindo Ao Jogo da Velha de POO!!! ============");
			jogo.Mostrar();
			
			do {//Starta jogo com jogador 1
				System.out.println("Jogador 1 - Inicie o jogo informando uma posição: ");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada Inválida");
					System.out.println("Jogador 1 - Inicie o jogo informando uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0); //finaliza jogada do jogador 1
			
			++Jogadas;
			valida = 0;
			jogo.Mostrar();
			
			if(!jogo.Ganhou(Jogadas).equals("null")) {
				break;
			}
			do {//Starta jogo com jogador 2
				System.out.println("Jogador 2 - Inicie o jogo informando uma posição: ");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada Inválida");
					System.out.println("Jogador 2 - Inicie o jogo informando uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0); //finaliza jogada do jogador 2
			
			Jogadas++;
			valida = 0;
			jogo.Mostrar();
			
			if(!jogo.Ganhou(Jogadas).equals("null")) {
				break;
			}
		}
                //criar uma variavel
              //String vencedor = "";
              if(jogo.Ganhou(Jogadas) == "VELHA"){
                    System.out.println("*** ------------DEU VELHA------------------!!!!! ***");
              }else{
                    System.out.println("*** PARABÉNS " + jogo.Ganhou(Jogadas) + " É O VENCEDOR!!!!! ***");
              }
		
        
    }
    
}
