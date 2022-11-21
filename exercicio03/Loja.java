package exercicio03;

import java.io.Serializable;

public class Loja implements Serializable{
    private int filial;
    private double venda;

    public Loja(int filial, double venda) {
        this.filial = filial;
        this.venda = venda;
    }

    public int getFilial() {
        return filial;
    }

    public double getVenda() {
        return venda;
    }
    
    public void setFilial(int filial) {
        this.filial = filial;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
}
