import java.util.Scanner;

public class Ex34 {
    public Ex34() {
        Scanner s = new Scanner(System.in);

        int contasEncerradas = 0;
        int opcao;

        do {
            System.out.println("\nOpções:");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nome = s.next();
                    System.out.print("Digite o número de diárias: ");
                    int numDiarias = s.nextInt();
                    double taxaServicos;

                    if (numDiarias < 15) {
                        taxaServicos = 7.50;
                    } else if (numDiarias == 15) {
                        taxaServicos = 6.50;
                    } else {
                        taxaServicos = 5.00;
                    }

                    double totalPagar = (50.00 + taxaServicos) * numDiarias;
                    System.out.println("Nome: " + nome);
                    System.out.println("Total a ser pago: R$ " + totalPagar);
                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção incorreta. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);

        s.close();
    }

    public static void main(String[] args) {
        new Ex34();
    }
}
