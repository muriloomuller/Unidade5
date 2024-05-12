import java.util.Scanner;

public class Ex19 {
    public Ex19() {
        Scanner scan = new Scanner(System.in);

        float valorDia = 0;

        while (true) {
            System.out.println("Digite o valor da compra: ");
            float valor = scan.nextFloat();
            float desconto = 0;

            if (valor > 500) {
                desconto = 0.2f;
            }
            if (valor <= 500 && valor != 0) {
                desconto = 0.15f;
            }

            float valorTotal = valor - (valor * desconto);

            valorDia += valorTotal;
            System.out.println("O valor à pagar é: R$" + valorTotal);

            if (valor == 0) {
                System.out.println("O valor arrecadado pela loja no dia é: R$" + valorDia);
                break;
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Ex19();
    }
}
