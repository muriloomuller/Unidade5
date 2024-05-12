import java.util.Scanner;

public class Ex1 {
    public Ex1() {
        Scanner scan = new Scanner(System.in);

        for (int quant = 0; quant < 20; quant++) {
            System.out.println("Digite um número: ");
            int n = scan.nextInt();

            if (n % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("ÍMPAR");
            }

        }

        scan.close();
    }
    public static void main(String[] args) {
        new Ex1();
    }
}
