import java.util.Scanner;

public class Ex33 {
    public Ex33() {
        Scanner s = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        int voto;
        do {
            System.out.println("Informe o voto\n1 para Candidato 1\n2 para Candidato 2\n3 para Candidato 3\n4 para Candidato 4\n5 para Voto Nulo\n6 para Voto Branco");
            voto = s.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Por favor, insira um número de opção válido.");
            }

            totalVotos++;
        } while (voto != 0);

        double percentualNulos = (double) votosNulos / totalVotos * 100;
        double percentualBranco = (double) votosEmBranco / totalVotos * 100;

        System.out.println("\nTotal de votos para cada candidato:");
        System.out.println("Candidato 1: " + votosCandidato1);
        System.out.println("Candidato 2: " + votosCandidato2);
        System.out.println("Candidato 3: " + votosCandidato3);
        System.out.println("Candidato 4: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBranco + "%");

        s.close();

    }

    public static void main(String[] args) {
        new Ex33();
    }
}
