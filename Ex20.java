import java.util.Scanner;

public class Ex20 {
    public Ex20() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a massa, em kg: ");
        double massaInicial = s.nextDouble();
        double massaWhile;

        massaWhile = massaInicial * 1000;
        int contadorTempo = 0;

        while (massaWhile > 0.5) {
            massaWhile = massaWhile / 2;
            contadorTempo++;
        }

        double tempo = contadorTempo * 50;

        System.out.println("Massa inicial : " + massaInicial + " kg.");
        System.out.println("Massa final : " + massaWhile + " gramas");
        System.out.println("Tempo : " + tempo + " segundos.");

        s.close();
    }

    public static void main(String[] args) {
        new Ex20();
    }
}
