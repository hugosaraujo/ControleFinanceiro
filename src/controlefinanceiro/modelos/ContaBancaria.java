package controlefinanceiro.modelos;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String consultaSaldo(){
        return "Saldo: %.2f".formatted(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double valorSaque){
        if(valorSaque > saldo) {
            System.out.println("Valor do saque maior que saldo disponível.");
            System.out.println("Tente um valor menor");
        } else {
            System.out.printf("Sacando R$ %.2f...", valorSaque);
            System.out.println();
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depósito realizado com sucesso!");
    }
}
