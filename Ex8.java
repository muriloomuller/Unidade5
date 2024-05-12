import java.util.Scanner;

public class Ex8 {
    public Ex8() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de termos da sequencia: ");
        int n = scan.nextInt();
        int menor = 0;
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero: ");
            int nums = scan.nextInt();
            if (nums < 0) {
                menor = Math.min(menor, nums);
            }
            if (nums > 0) {
                soma += nums;
                cont++;
            }
        }

        float media = (float) soma / cont;

        System.out.println("O menor numero negativo é: " + menor);
        System.out.println("A média dos números positivos é: " + media);

        scan.close();
    }
    public static void main(String[] args) {
        new Ex8();
    }
}
