import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo ao aplicativo de controle finaceiro");
        System.out.print("Digite o seu nome: ");
        String nome = leitura.nextLine();

        System.out.printf("Olá, %s. Informe agora o seu saldo atual: ".formatted(nome));
        double saldo = leitura.nextDouble();

        String menuDeOpcoes = """
                1- Consultar dados
                2- Depositar valor
                3- Transferir valor
                0- Sair
                """;

        System.out.println(menuDeOpcoes);

        System.out.print("Insira o número da operação que quer realizar: ");
        int opcaoValida = leitura.nextInt();
        switch (opcaoValida) {
            case 1:
                System.out.println("Opção 1 - Consultar dados");
                String consultaDeSaldo = """
                        Titular: %s
                        Saldo: %.2f
                        """.formatted(nome, saldo);
                System.out.println(consultaDeSaldo);
                break;
            case 2:
                System.out.println("Opção 2 - Depositar valor");
                break;
            case 3:
                System.out.println("Opção 3 - Sacar valor");
                break;
            case 0:
                System.out.println("Saindo da Aplicação...");
                System.out.println("Tchau, tchau");
                break;
            default:
                System.out.println("Essa não é uma opção válida");
                System.out.println("Tente novamente");
                break;
        }
    }

}
