import java.util.Scanner;

public class Ex13 {
    public Ex13() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de abastecimentos na viagem: ");
        int numeroAbastecimentos = scan.nextInt();
        double kmLitro;
        int litroTotal = 0;
        int kmTotal = 0;
        int kmLitroTotal;

        for (int i = 0; i < numeroAbastecimentos; i++) {

            System.out.println("Digite o numero de litros nesse abastecimento: ");
            double litros = scan.nextDouble();
            System.out.println("Digite a distância percorrida: ");
            double km = scan.nextDouble();

            kmLitro = km / litros;

            System.out.println("A quilometragem obtida por litro na viagem é: " + kmLitro);

            litroTotal += litros;
            kmTotal += km;

        }

        kmLitroTotal = kmTotal / litroTotal;

        System.out.println("A quilometragem obtida por litro nessa parada é: " + kmLitroTotal);

        scan.close();
    }
    public static void main(String[] args) {
        new Ex13();
    }
}
