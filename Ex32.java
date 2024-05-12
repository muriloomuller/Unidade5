import java.util.Scanner;

public class Ex32 {
    public Ex32() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int diaSemana = s.nextInt();

        if (diaSemana > 7 || diaSemana < 1) {
            while (true) {
                System.out.println("Informe um valor válido");
                System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
                diaSemana = s.nextInt();

                if (diaSemana <= 7 && diaSemana >= 1) {
                    break;
                }
            }
        }

        System.out.print("Digite o número de dias que o mês possui: ");
        int diasMes = s.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        int diaAtual = 1;
        int colunaAtual = 1;

        while (diaAtual <= diasMes) {
            if (colunaAtual == 1 && diaAtual != 1) {
                System.out.println();
            }

            if (colunaAtual < diaSemana && diaAtual == 1) {
                System.out.print("\t");
            } else {
                System.out.print(diaAtual + "\t");
                diaAtual++;
            }

            colunaAtual = (colunaAtual % 7) + 1;
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex32();
    }
}
