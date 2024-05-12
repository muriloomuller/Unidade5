import java.util.Scanner;

public class Ex21 {
    public Ex21() {
        Scanner s = new Scanner(System.in);

        double alturaChico = 150;
        double alturaZe = 110;
        int contadorAno = 0;

        while (alturaChico > alturaZe) {
            alturaChico = alturaChico + 2;
            alturaZe = alturaZe + 3;
            contadorAno++;
        }

        System.out.println("Levará " + contadorAno + " anos para Zé ultrapassar a altura de Chico.");

        s.close();
    }

    public static void main(String[] args) {
        new Ex21();
    }
}
