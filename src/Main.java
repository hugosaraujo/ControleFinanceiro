import controlefinanceiro.modelos.CartaoCredito;
import controlefinanceiro.modelos.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int opcaoSelecionada = -1;

        System.out.println("Bem vindo ao aplicativo de controle de gastos do cartão");

        System.out.print("Antes de qualquer coisa, precisamos do seu nome: ");
        String nome = leitura.nextLine();

        System.out.print("Insira o limite do cartão: ");
        double limiteCartao = leitura.nextDouble();
        CartaoCredito meuCartao = new CartaoCredito(limiteCartao);

        String menuDeOpcoes = """
                1- Consultar saldo
                2- Aumentar limite do cartão
                3- Efetuar compra
                0- Sair
                """;

        while(opcaoSelecionada != 0){

            System.out.println(menuDeOpcoes);

            System.out.print("Insira o número da operação que quer realizar: ");
            opcaoSelecionada = leitura.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("Opção 1 - Consultar saldo");
                    String saldoAtual = """
                            ***********************
                            Saldo de %S: %.2f;
                            ***********************
                            """.formatted(nome, meuCartao.getSaldo());
                    System.out.println(saldoAtual);
                    break;
                case 2:
                    System.out.println("Opção 2 - Aumentar limite do Cartão");
                    System.out.printf("%s, insira o valor que deseja depositar: ".formatted(nome));
                    double valorDeposito = leitura.nextDouble();
                    meuCartao.aumentarLimite(valorDeposito);
                    break;
                case 3:
                    System.out.println("Opção 3 - Fazer compra");

                    System.out.print("Informe o nome do produto: ");
                    String nomeProduto = leitura.next();

                    System.out.print("Informe o preço do produto: ");
                    double precoProduto = leitura.nextDouble();

                    Compra minhaCompra = new Compra(nomeProduto, precoProduto);
                    meuCartao.lancaCompra(minhaCompra);
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
