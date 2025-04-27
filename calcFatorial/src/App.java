public class App {
    public static void main(String[] args) throws Exception {
        int fatorial = 10;
        int resultado = 1;

        for (int i = fatorial; i > 1; i--) {
            resultado *= i;
        }

        System.out.println("Resultado final: " + resultado);
    }
}
