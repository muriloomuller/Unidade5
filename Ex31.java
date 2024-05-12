import java.util.Scanner;

public class Ex31 {
    public Ex31() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int fator = 2;
        System.out.println("Número\tDecomposição");
        while (numero > 1) {
            if (numero % fator == 0) {
                System.out.println(numero + "\t" + fator);
                numero /= fator;
            } else {
                fator++;
            }
        }
        System.out.println("1\t");

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex31();
    }
}