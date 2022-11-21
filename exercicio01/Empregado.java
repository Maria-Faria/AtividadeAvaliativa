package exercicio01;

abstract class Empregado {
    protected String primeiroNome, ultimoNome;

    public Empregado(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    abstract double calcularGanho();
}
