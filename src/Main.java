import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcaoSelecionada = -1;

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

        while(opcaoSelecionada != 0){

            System.out.println(menuDeOpcoes);

            System.out.print("Insira o número da operação que quer realizar: ");
            opcaoSelecionada = leitura.nextInt();

            switch (opcaoSelecionada) {
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
                    System.out.printf("%s, insira o valor que deseja depositar: ".formatted(nome));
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Opção 3 - Sacar valor");
                    System.out.printf("%s, informe o valor do saque: ".formatted(nome));
                    double saque = leitura.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente, tente sacar um valor menor");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }

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
}
