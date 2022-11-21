package exercicio01;

public class TrabalhadorComissionado extends Empregado{
    private double salario, comissao;
    private int quantidade;
    
    public TrabalhadorComissionado(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    double calcularGanho() {
        return salario + (comissao * quantidade);
    }
    
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
