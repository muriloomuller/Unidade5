import java.util.Scanner;

public class Ex30 {
    public Ex30() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor N");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Digite um valor maior do que 0");
            System.out.println("Digite o valor N");
            n = s.nextInt();
        }

        System.out.println("Digite o valor K");
        int k = s.nextInt();
            while (k <= 0) {
            System.out.println("Digite um valor maior do que 0");
            System.out.println("Digite o valor K");
                k = s.nextInt();
            }

        System.out.println("Digite o valor M");
        int m = s.nextInt();
            while (m <= 0) {
            System.out.println("Digite um valor maior do que 0");
            System.out.println("Digite o valor M");
            m = s.nextInt(); 
            }

        System.out.print("Elementos a serem colocados na mochila: ");

        String elementosDentroMochila = "";
        String elementosForaMochila = "";
        int somaElementosDentroMochila = 0;
        int somaElementosForaMochila = 0;

        while (n > 0) {
            System.out.println(n + " ");
            if (m > 0) {
                elementosDentroMochila += n + " ";
                somaElementosDentroMochila += n;
                m--;
            } else {
                elementosForaMochila += n + " ";
                somaElementosForaMochila += n;
            }
            n -= k;
        }
        System.out.println("Elementos na mochila: " + elementosDentroMochila);
        System.out.println("Elementos fora da mochila: " + elementosForaMochila);
        System.out.println("Soma dos elementos que estão dentro da mochila: " + somaElementosDentroMochila);
        System.out.println("Soma dos elementos que estão fora da mochila: " + somaElementosForaMochila);

        s.close();
    }

    public static void main(String[] args) {
        new Ex30();
    }

}