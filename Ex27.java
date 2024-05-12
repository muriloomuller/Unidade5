import java.util.Scanner;

public class Ex27 {
    public Ex27(){
        Scanner s = new Scanner(System.in);
        int dia;
        
        while (true) {
            System.out.print("Digite o dia do mês de abril (1 a 30): ");
            dia = s.nextInt();
            if (dia >= 1 && dia <= 30) {
                break;
            } else {
                System.out.println("Dia inválido.");
            }
        }

        int manha, tarde;
        double salario;

        System.out.print("Total de peças produzidas pela manhã: ");
        manha = s.nextInt();

        System.out.print("Total de peças produzidas pela tarde: ");
        tarde = s.nextInt();

        if (dia <= 15) {
            if (manha >= 30 && tarde >= 30 && (manha + tarde) > 100) {
                salario = (manha + tarde) * 0.80;
            } else {
                salario = (manha + tarde) * 0.50;
            }
        } else {
            salario = (manha * 0.40) + (tarde * 0.30);
        }

        System.out.println("Valor a ser recebido: R$ " + salario);

        int novoFuncionario;
        System.out.print("Novo funcionário? (1. sim / 2. não): ");
        novoFuncionario = s.nextInt();

        if (novoFuncionario != 1) {
            s.close();
            return;
        }
    }
    public static void main(String[] args) {
        new Ex27();
    }
}
