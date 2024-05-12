import java.util.Scanner;

public class Ex29 {
    public Ex29() {
        Scanner s = new Scanner(System.in);

        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;

        System.out.println("Escreva um valor: ");
        int valor = s.nextInt();

        while (valor >= 20) {
            valor -= 20;
            n20++;
        }
        while (valor >= 10) {
            valor -= 10;
            n10++;
        }
        while (valor >= 5) {
            valor -= 5;
            n5++;
        }
        while (valor >= 2) {
            valor -= 2;
            n2++;
        }
        while (valor >= 1) {
            valor -= 1;
            n1++;
        }

        if (n20 > 0) {
            System.out.println(n20 + " cédula(s) de 20.");
        }
        if (n10 > 0) {
            System.out.println(n10 + " cédula(s) de 10.");
        }
        if (n5 > 0) {
            System.out.println(n5 + " cédula(s) de 5.");
        }
        if (n2 > 0) {
            System.out.println(n2 + " cédula(s) de 2.");
        }
        if (n1 > 0) {
            System.out.println(n1 + " cédula(s) de 1.");
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex29();
    }
}
