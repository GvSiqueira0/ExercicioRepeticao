public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {3, 7, 12, 1, 9, 4, 6, 15, 2, 10};
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            soma = soma + numeros[i];
        }

        System.out.println(soma);
    }
}


