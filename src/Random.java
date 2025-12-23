import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Criar o Scanner usando try-with-resources garante que ele seja fechado automaticamente
        try (Scanner leitura = new Scanner(System.in)) {
            Random gerador = new Random();
            int numeroSecreto = gerador.nextInt(100);
            int totalTentativas = 5;

            // Dica de debug (pode remover se quiser o jogo difícil)
            System.out.println("[DEBUG] Número secreto: " + numeroSecreto);
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

                System.out.print("Seu palpite: ");
                int palpiteUsuario = leitura.nextInt();

                if (palpiteUsuario == numeroSecreto) {
                    System.out.println("\n✨ PARABÉNS! Você acertou o número secreto!");
                    break;
                }

                // Fornecer dicas enquanto houver tentativas
                if (i < totalTentativas - 1) {
                    if (palpiteUsuario < numeroSecreto) {
                        System.out.println("DICA: O número secreto é MAIOR.");
                    } else {
                        System.out.println("DICA: O número secreto é MENOR.");
                    }
                } else {
                    // Mensagem final caso perca todas as chances
                    System.out.println("\nGAME OVER! Que pena, você não conseguiu.");
                    System.out.println("O número secreto era: " + numeroSecreto);
                }
            }
        }
    }
}