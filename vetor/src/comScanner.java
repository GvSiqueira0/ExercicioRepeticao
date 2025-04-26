import java.util.Scanner;
public class comScanner {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {};
        int soma = 0;

        System.out.println("Digite 10 números: ");
        numeros = new int[10];
        for (int i = 0; i < 10; i++) {
          
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
        }

        System.out.println(soma);
        sc.close();
    }
}
