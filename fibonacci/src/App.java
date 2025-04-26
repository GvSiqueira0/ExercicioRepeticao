public class App {
    public static void main(String[] args) throws Exception {
        
        int num1 = 0;
        int num2 = 1;

        int i = 0;
        while (i < 10 ){
            System.out.println(num1);
            int soma = num1 + num2;
            num1 = num2;
            num2 = soma;
            i++;
            
        }
    }
}
