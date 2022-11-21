package exercicio01;

public class Chefe extends Empregado{
    private double salario;
    
    public Chefe(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    public double calcularGanho() {
        return salario * 4;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
