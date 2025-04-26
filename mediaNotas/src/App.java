import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int totalNotas = 0;
        double soma = 0;
        String resposta = "";
        double nota;

        do {

            System.out.println("Insira a nota " + (totalNotas + 1));
            nota = sc.nextDouble();

            if (nota > 10 || nota < 0) {
                System.out.println("Nota inválida!");
                continue;
            }
            soma = soma + nota;
            totalNotas++;

            System.out.println("\nDeseja inserir mais uma nota? (S/N)");
            resposta = sc.next();

            if (resposta.equals("N")) {
                break;
            }

        } while (resposta.equalsIgnoreCase("S"));

        double media = (soma / totalNotas);
        System.out.println("\nA média é: " + media);

        sc.close();
    }
}
