import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        do {
            System.out.print("Digite um número entre 1 e 100: ");
            num = sc.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("Número inválido!");
            }
        }
         while (num < 1 || num > 100);
         System.out.println("\n Numero válido: "+num);
         
         sc.close();

    }
}
