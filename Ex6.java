import java.util.Scanner;

public class Ex6 {
    public Ex6() {
        
        Scanner scan = new Scanner(System.in);

        double somamedia = 0;

        for (int quant = 1; quant < 21; quant++) {
            System.out.println("Digite a altura: ");
            float altura = scan.nextFloat();
            somamedia += altura;
        }

        double media = somamedia / 20;

        System.out.println(media);

        scan.close();
    }

    public static void main(String[] args) {
        new Ex6();
    }
}
