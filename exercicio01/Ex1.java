package exercicio01;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        String primeiroNome, ultimoNome;
        String op[] = {"Chefe", "Comissionado", "Hora", "Peça produzida", "Sair"};
        int op2, quantidade, horas;
        double salario, ganho = 0, comissao;

        do{
            
            primeiroNome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome");

            if(primeiroNome == null) {
                break;
            
            }else if (primeiroNome == ""){
                System.out.println(primeiroNome);
            }

            ultimoNome = JOptionPane.showInputDialog(null, "Digite seu último nome");

            if(ultimoNome == null) {
                break;
            }

            op2 = JOptionPane.showOptionDialog(null, "Selecione o tipo de empregado", (primeiroNome + " " + ultimoNome), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, 0);
            
            if(op2 == 4 || op2 == -1) {
                break;
            }

            switch(op2) {
                case 0:
                    Chefe e1 = new Chefe(primeiroNome, ultimoNome);

                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário semanal"));
  
                    e1.setSalario(salario);
                    ganho = e1.calcularGanho();

                    break;

                case 1:
                    TrabalhadorComissionado e2 = new TrabalhadorComissionado(primeiroNome, ultimoNome);
                    
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário"));

                    e2.setSalario(salario);

                    comissao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da comissão sobre as vendas"));
                    e2.setComissao(comissao);

                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de vendas"));
                    e2.setQuantidade(quantidade);

                    ganho = e2.calcularGanho();

                    break;

                case 2:
                    TrabalhadorHora e3 = new TrabalhadorHora(primeiroNome, ultimoNome);

                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário por hora"));
                    e3.setSalarioHora(salario);

                    horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas"));
                    e3.setHoras(horas);

                    ganho = e3.calcularGanho();

                    break;

                case 3:
                    TrabalhadorPecaProduzida e4 = new TrabalhadorPecaProduzida(primeiroNome, ultimoNome);

                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua remuneração por peça produzida"));
                    e4.setRemuneracao(salario);

                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de peças produzidas"));
                    e4.setQuantidade(quantidade);

                    ganho = e4.calcularGanho();

                    break;                    
            }

            JOptionPane.showMessageDialog(null, "Ganho do empregado: R$" + ganho);
            
        }while(op2 != 4);
    
    }
}