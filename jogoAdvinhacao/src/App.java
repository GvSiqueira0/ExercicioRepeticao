import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(1, 20) ; 
        int tentativas = 0;
        int chute;
         System.out.println("Jogo da adivinhação");
        System.out.println("Digite um número entre 1 e 20");
        do {
            System.out.print("Digite um número: ");
            chute = sc.nextInt();
            tentativas++;
            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (chute != numeroSecreto );

        sc.close();
    }
}
