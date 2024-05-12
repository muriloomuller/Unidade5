import java.util.Scanner;

public class Ex7 {
    public Ex7() {
        Scanner scan = new Scanner(System.in);

        float max = Float.MAX_VALUE; 
        float min = Float.MIN_VALUE; 

        System.out.println("Quantidade de números a ser informado: ");
        int n = scan.nextInt();

        for (int quant = 0; quant < n; quant++) {
            System.out.println("Digite o número: ");
            float numero = scan.nextFloat();
            if (numero > min) {
                min = numero;
            }
            if (numero < max) {
                max = numero;
            }

        }
        System.out.println("Maior número : " + min + "\nMenor número : " + max);

        scan.close();
    }
    public static void main(String[] args) {
        new Ex7();
    }
}
