import java.util.Scanner;
import java.util.Random;

class JogoAdivinhacao {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            Random gerador = new Random();
            int numeroSecreto = gerador.nextInt(100);
            int totalTentativas = 5;

            System.out.println("==========================================");
            System.out.println("   BEM-VINDO AO JOGO DE ADIVINHAÇÃO       ");
            System.out.println("==========================================");

            for (int i = 0; i < totalTentativas; i++) {
                if (i == 0) {
                    System.out.println("Tente a sorte! Adivinhe o número entre 0 e 99:");
                } else {
                    int chancesRestantes = totalTentativas - i;
                    System.out.println("\nIncorreto! Você ainda tem " + chancesRestantes + " chance(s).");
                }

                int palpiteUsuario;

                while (true) {
                    System.out.print("Seu palpite (0-99): ");
                    palpiteUsuario = leitura.nextInt();

                    if (palpiteUsuario >= 0 && palpiteUsuario <= 99) {
                        break;
                    } else {
                        System.out.println("[AVISO] Número inválido! Por favor, digite um valor entre 0 e 99.");
                    }
                }

                if (palpiteUsuario == numeroSecreto) {
                    System.out.println("\n✨ PARABÉNS! Você acertou o número secreto!");
                    break;
                }

                if (i < totalTentativas - 1) {
                    if (palpiteUsuario < numeroSecreto) {
                        System.out.println("DICA: O número secreto é MAIOR.");
                    } else {
                        System.out.println("DICA: O número secreto é MENOR.");
                    }
                } else {
                    System.out.println("\nGAME OVER! Que pena, você não conseguiu.");
                    System.out.println("O número secreto era: " + numeroSecreto);
                }
            }
        }
    }
}