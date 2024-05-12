import java.util.Scanner;

public class Ex26 {
    public Ex26(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: ");
        double valorMaximoPedagio = scanner.nextDouble();
        
        int trechosAcimaDoLimite = 0;
        int totalTrechos = 0;
        int trechosAcimaDe150Km = 0;

        while (true) {
            System.out.print("Pedágio: ");
            double custoPedagio = scanner.nextDouble();
            
            if (custoPedagio < 0) {
                break;
            }
            
            System.out.print("Distância (em Km): ");
            int distancia = scanner.nextInt();
            
            totalTrechos++;

            if (custoPedagio > valorMaximoPedagio) {
                trechosAcimaDoLimite++;
            }
            
            if (distancia > 150 && custoPedagio <= valorMaximoPedagio) {
                trechosAcimaDe150Km++;
            }
        }

        System.out.println(trechosAcimaDoLimite);
        System.out.println(totalTrechos);
        System.out.println(trechosAcimaDe150Km);

        scanner.close();
    }
    public static void main(String[] args) {
        new Ex26();
    }
}
