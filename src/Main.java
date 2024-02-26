import controlefinanceiro.modelos.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int opcaoSelecionada = -1;

        System.out.println("Bem vindo ao aplicativo de controle finaceiro");

        System.out.print("Digite o seu nome: ");
        String nome = leitura.nextLine();
        conta.setTitular(nome);

        String menuDeOpcoes = """
                1- Consultar saldo
                2- Depositar valor
                3- Sacar valor
                0- Sair
                """;

        while(opcaoSelecionada != 0){

            System.out.println(menuDeOpcoes);

            System.out.print("Insira o número da operação que quer realizar: ");
            opcaoSelecionada = leitura.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("Opção 1 - Consultar saldo");
                    System.out.println(conta.consultaSaldo());
                    break;
                case 2:
                    System.out.println("Opção 2 - Depositar valor");
                    System.out.printf("%s, insira o valor que deseja depositar: ".formatted(nome));
                    double valorDeposito = leitura.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Opção 3 - Sacar valor");
                    System.out.printf("%s, informe o valor do saque: ".formatted(nome));
                    double valorSaque = leitura.nextDouble();
                    conta.sacar(valorSaque);
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
        leitura.close();
    }
}
