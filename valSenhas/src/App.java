import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String senha = "teste1";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senhaDigitada.equals(senha)) {
            System.out.println("Senha incorreta, digite novamente!");
            System.out.print("\nDigite a senha: ");
            senhaDigitada = sc.nextLine();
            
        }

        System.out.println("Acesso concedido!");
        sc.close();
        
    }
}
