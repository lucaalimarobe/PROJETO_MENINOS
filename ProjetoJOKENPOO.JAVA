import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesouraEducativo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Jogo Pedra Papel e Tesoura Educativo");
        
        String[] itens = {"PEDRA", "PAPEL", "TESOURA"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        
        int pontos = 0;

        for (int i = 0; i < 3; i++) { // 3 rodadas
            int computador = random.nextInt(3);
            int pergunta = random.nextInt(10); // 10 perguntas

            System.out.println("Pergunta: Quanto é " + (pergunta + 1) + " + " + (pergunta + 2) + "?");
            int respostaCorreta = (pergunta + 1) + (pergunta + 2);
            System.out.print("Sua resposta: ");
            int respostaJogador = scanner.nextInt();

            if (respostaJogador == respostaCorreta) {
                System.out.println("Correto! Você pode jogar.");
                System.out.println("Escolha uma das opções:");
                System.out.println("[0] PEDRA");
                System.out.println("[1] PAPEL");
                System.out.println("[2] TESOURA");
                
                int jogador = scanner.nextInt();
                
                System.out.println("JO");
                Thread.sleep(1000);
                System.out.println("KEN");
                Thread.sleep(1000);
                System.out.println("POO!!!");
                Thread.sleep(1000);
                System.out.println("--------------------");
                System.out.println("Computador jogou " + itens[computador]);
                System.out.println(nome + " jogou " + itens[jogador]);
                System.out.println("--------------------");

                if (computador == jogador) {
                    System.out.println("DEU EMPATE");
                } else if ((jogador == 0 && computador == 2) || (jogador == 1 && computador == 0) || (jogador == 2 && computador == 1)) {
                    System.out.println(nome + " GANHOU!");
                    pontos++;
                } else {
                    System.out.println("Computador GANHOU!");
                }
            } else {
                System.out.println("Resposta errada! Tente novamente.");
            }
            System.out.println("Você tem " + pontos + " pontos.");
        }
        
        System.out.println("Fim do jogo! Você fez " + pontos + " pontos.");
        scanner.close();
    }
}
