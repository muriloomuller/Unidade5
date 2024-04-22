import java.util.Scanner;

public class Ex1 {
    public Ex1() {

        Scanner scan = new Scanner(System.in);

        for(int quantidade = 0; quantidade < 20; quantidade++) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }

        scan.close();
    }
    public static void main(String[] args) {
        new Ex1();
    }
}