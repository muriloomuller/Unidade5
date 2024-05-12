import java.util.Scanner;

public class Ex14 {
    public Ex14() {
        Scanner s = new Scanner(System.in);

        double lucroPorcentagem;
        int contadorMenos10 = 0;
        int contadorEntre10e20 = 0;
        int contadorMais20 = 0;
        double pcTotal = 0;
        double pvTotal = 0;
        double lucro = 0;
        double lucroTotal = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome da mercadoria: ");
            String nome = s.next();
            System.out.println("Digite o preço de compra da mercadoria: ");
            double pc = s.nextDouble();
            System.out.println("Digite o preço de venda da mercadoria: ");
            double pv = s.nextDouble();

            pcTotal += pc;
            pvTotal += pv;
            lucro = pv - pc;
            lucroTotal += lucro;

            lucroPorcentagem = (pv - pc) / pc * 100;

            if (lucroPorcentagem < 10) {
                contadorMenos10++;
            }
            if (lucroPorcentagem >= 10 && lucroPorcentagem <= 20) {
                contadorEntre10e20++;
            }
            if (lucroPorcentagem > 20) {
                contadorMais20++;
                
            System.out.println(nome);
            }

        }
        
        System.out.println("O número de mercadorias com menos de 10% de lucro é: " + contadorMenos10);
        System.out.println("O número de mercadorias com lucro entre 10 e 20% é: " + contadorEntre10e20);
        System.out.println("O número de mercadorias com mais de 20% de lucro é: " + contadorMais20);
        System.out.println("O valor total de compra é: R$" + pcTotal);
        System.out.println("O valor total de vende é: R$" + pvTotal);
        System.out.println("O valor total do lucro é: R$" + lucroTotal);

        s.close();
    }
    public static void main(String[] args) {
        new Ex14();
    }
}
