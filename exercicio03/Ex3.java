package exercicio03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        
        final var localeAmericano = new Locale("en", "US");
        Locale.setDefault(localeAmericano);

        ArrayList<Loja> cadastro = new ArrayList<Loja>();
        ArrayList<Loja> filial1 = new ArrayList<Loja>();
        ArrayList<Loja> filial2 = new ArrayList<Loja>();
        ArrayList<Loja> filial3 = new ArrayList<Loja>();
        ArrayList<Loja> filial4 = new ArrayList<Loja>();
            
        try {
            File f = criarArquivo("loja.txt");
            gerarDados(cadastro);
            gravarArquivo(cadastro, "loja.txt");
            lerArquivo(f, filial1, filial2, filial3, filial4);
            separarInfo(filial1, filial2, filial3, filial4);
            vendas(filial1, filial2, filial3, filial4);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static File criarArquivo(String nomeArq) throws IOException {

        File f = new File(nomeArq);

        boolean success = f.createNewFile();

        if(success) {
            JOptionPane.showMessageDialog(null, "Arquivo " + f + " criado com sucesso!");
        
        }else {
            JOptionPane.showMessageDialog(null, "Arquivo " + f + " já existe!");
        }

        return f;
    }

    public static void gerarDados(ArrayList<Loja> cadastro) {

        Loja l1 = new Loja(1, 189.90);
        cadastro.add(l1);

        Loja l2 = new Loja(1, 45.70);
        cadastro.add(l2);

        Loja l3 = new Loja(3, 29.90);
        cadastro.add(l3);

        Loja l4 = new Loja(4, 55.00);
        cadastro.add(l4);

        Loja l5 = new Loja(2, 250.00);
        cadastro.add(l5);

        Loja l6 = new Loja(1, 22.36);
        cadastro.add(l6);

        Loja l7 = new Loja(2, 35.55);
        cadastro.add(l7);

        Loja l8 = new Loja(3, 225.00);
        cadastro.add(l8);

        Loja l9 = new Loja(4, 35.55);
        cadastro.add(l9);

        Loja l10 = new Loja(2, 54.58);
        cadastro.add(l10);
    }

    public static void gravarArquivo(ArrayList<Loja> cadastro, String fileName) {
        try{
            FileWriter writer = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(writer);

            for(int i = 0; i < cadastro.size(); i++) {
                printWriter.printf("%d, %.2f\n", cadastro.get(i).getFilial(), cadastro.get(i).getVenda());
            }

            printWriter.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo(File nomeArq, ArrayList<Loja> filial1, ArrayList<Loja> filial2, ArrayList<Loja> filial3, ArrayList<Loja> filial4) {

        try {
            FileReader fr = new FileReader(nomeArq);
            BufferedReader in = new BufferedReader(fr);   
        
            String linha = null;
            String info[];

            while((linha = in.readLine()) != null) {
                info = linha.split(",");
                Loja loja = new Loja(Integer.parseInt(info[0]), Double.parseDouble(info[1]));

                switch(Integer.parseInt(info[0])) {
                    case 1:
                        filial1.add(loja);
                        break;

                    case 2:
                        filial2.add(loja);
                        break;
                    
                    case 3:
                        filial3.add(loja);
                        break;
                    
                    case 4:
                        filial4.add(loja);
                        break;
                }
            }
            in.close();
        
        }
        catch (IOException e) {
            System.out.println("Não foi possível ler dados do arquivo! " + e);
        }
    }

    public static void separarInfo(ArrayList<Loja> filial1, ArrayList<Loja> filial2, ArrayList<Loja> filial3, ArrayList<Loja> filial4) {
        try {
            criarArquivo("filial1.txt");
            gravarArquivo(filial1, "filial1.txt");

            criarArquivo("filial2.txt");
            gravarArquivo(filial2, "filial2.txt");

            criarArquivo("filial3.txt");
            gravarArquivo(filial3, "filial3.txt");

            criarArquivo("filial4.txt");
            gravarArquivo(filial4, "filial4.txt");
        
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }

    public static void vendas(ArrayList<Loja> filial1, ArrayList<Loja> filial2, ArrayList<Loja> filial3, ArrayList<Loja> filial4){
        String arq[] = {"filial1.txt", "filial2.txt", "filial3.txt", "filial4.txt"};

        try{
            for(int i = 0; i < 4; i++) {
                FileReader reader = new FileReader(arq[i]);
                BufferedReader leitor = new BufferedReader(reader);

                String linha = null;
                double total = 0, media = 0, ct = 0;

                String dados [];

                while((linha = leitor.readLine()) != null) {
                    dados = linha.split(",");

                    total += Double.parseDouble(dados[1]);
                    ct++;
                }

                media = total/ct;

                JOptionPane.showMessageDialog(null, "Filial " + (i + 1) +  String.format("\nValor total das vendas = R$%.2f", total) + String.format("\nValor médio das vendas = R$%.2f", media));

                FileWriter writer = new FileWriter(arq[i], true);
                PrintWriter printWriter = new PrintWriter(writer);
                
                printWriter.printf("Total de vendas: R$%.2f\n", total);
                printWriter.printf("Valor médio das vendas: R$%.2f", media);
                
                leitor.close();
                printWriter.close();
            }

        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}