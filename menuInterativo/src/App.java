import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("\nAdicionar executado!\n");
            } else if (opcao == 2) {
                System.out.println("\nRemover executado!\n");
            }
        } while (opcao != 3);
        System.out.println("Encerrando!");
        sc.close();
    }
}
