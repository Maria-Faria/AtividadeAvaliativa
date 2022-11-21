package exercicio01;

public class TrabalhadorPecaProduzida extends Empregado{
    private int quantidade;
    private double remuneracao;

    public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    double calcularGanho() {
        return remuneracao * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }
    
}
