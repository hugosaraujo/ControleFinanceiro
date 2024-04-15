package controlefinanceiro.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }
    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public void aumentarLimite(double aumento){
        this.limite += aumento;
        saldo = this.limite;
    }
}
