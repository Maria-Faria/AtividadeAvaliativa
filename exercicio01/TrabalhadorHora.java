package exercicio01;

public class TrabalhadorHora extends Empregado{
    private int horas;
    private double salarioHora;

    public TrabalhadorHora(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    double calcularGanho() {
        return salarioHora * horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
}
