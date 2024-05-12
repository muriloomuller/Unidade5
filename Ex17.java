import java.util.Scanner;

public class Ex17 {
    public Ex17() {
        Scanner s = new Scanner(System.in);

        float maiorAltura = Float.MIN_VALUE;
        float menorAltura = Float.MAX_VALUE;
        float alturaTotal = 0;
        float contadorAtletas = 0;
        float mediaAlturaTotal;
        int inscricaoAtletaMaisAlto = 0;
        int inscricaoAtletaMaisBaixo = 0;

        while (true) {
            System.out.println("Informe o número de inscrição do atleta: ");
            int numeroInscricao = s.nextInt();

            System.out.println("Informe a altura do atleta: ");
            float altura = s.nextFloat();

            alturaTotal += altura;
            contadorAtletas++;
            mediaAlturaTotal = alturaTotal / contadorAtletas;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                inscricaoAtletaMaisAlto = numeroInscricao;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                inscricaoAtletaMaisBaixo = numeroInscricao;
            }
            if (numeroInscricao == 0) {

                System.out.println(
                        "O atleta mais alto (" + inscricaoAtletaMaisAlto + ") possui " + maiorAltura
                                + " metros de altura.");
                System.out.println(
                        "O atleta mais baixo (" + inscricaoAtletaMaisBaixo + ") possui " + menorAltura
                                + " metros de altura.");
                System.out.println("A altura média dos atletas é: " + mediaAlturaTotal);

                break;
            }
            
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex17();
    }
}
