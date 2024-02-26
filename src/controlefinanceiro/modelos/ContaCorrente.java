package controlefinanceiro.modelos;

public class ContaCorrente extends ContaBancaria{
    //tarifa bancária deverá ser cobrada no momento me que é chamado o construtor da classe;
    //apagar o método que utiliza o field tarifa bancária;
    private double tarifaBancaria = 12.20;

    public void cobraTarifaBancaria(){
        if(saldo < tarifaBancaria){
            System.out.println("Não foi possível cobrar valor de tarifa bancária");
            System.out.println("Valor do saldo insuficiente");
        } else {
            saldo -= tarifaBancaria;
            System.out.printf("R$ %.2f relacionado a tarifa bancária foi descontado da conta.", tarifaBancaria);
        }
    }
}
