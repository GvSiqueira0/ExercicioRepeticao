public class App {
    public static void main(String[] args) throws Exception {
        long fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
