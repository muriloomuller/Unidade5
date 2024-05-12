import java.util.Scanner;

public class Ex24 {
    public Ex24() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o limite diário,em kg: ");
        double limiteDiario = s.nextDouble();

        while (true) {
            System.out.println("Informe o peso do peixe, em kg: ");
            double pesoPeixe = s.nextDouble();

            double pesoExcedido = limiteDiario -= pesoPeixe;

            if (limiteDiario <= 0) {
                pesoExcedido = pesoExcedido * (-1);
                System.out.println("Limite diário excedido " + pesoExcedido + " kgs.");
                break;
            }

            System.out.println("Quer informar o peso de mais um peixe? \nS para SIM | N para NÃO");
            String escolha = s.next();
            char escolhaA = escolha.toLowerCase().charAt(0);

            if (escolhaA == 'n') {
                break;
            }
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex24();
    }
}
