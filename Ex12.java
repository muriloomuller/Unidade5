import java.util.Scanner;

public class Ex12 {
    public Ex12() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero");
        int n = scan.nextInt();
        int j = 0;
        int k = 0;

        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(k + "  ");

                k++;
            }
            System.out.println();
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex12();
    }

}
