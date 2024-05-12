import java.util.Scanner;

public class Ex18 {
    public Ex18() {
        Scanner s = new Scanner(System.in);

        int audiencia4 = 0;
        int audiencia5 = 0;
        int audiencia9 = 0;
        int audiencia12 = 0;
        int contadorPessoas = 0;

        while (true) {
            System.out.println("Digite o canal: ");
            int canal = s.nextInt();
            if (canal == 0)
                break;
            System.out.println("Digite o numero de pessoas: ");
            int pessoas = s.nextInt();

            switch (canal) {
                case 4:
                    audiencia4 += pessoas;
                    contadorPessoas += pessoas;
                    break;
                case 5:
                    audiencia5 += pessoas;
                    contadorPessoas += pessoas;
                    break;
                case 9:
                    audiencia9 += pessoas;
                    contadorPessoas += pessoas;
                    break;
                case 12:
                    audiencia12 += pessoas;
                    contadorPessoas += pessoas;
                    break;
            }
        }
        
        double porcentagemAudiencia4 = (double) audiencia4 / contadorPessoas * 100;
        double porcentagemAudiencia5 = (double) audiencia5 / contadorPessoas * 100;
        double porcentagemAudiencia9 = (double) audiencia9 / contadorPessoas * 100;
        double porcentagemAudiencia12 = (double) audiencia12 / contadorPessoas * 100;

        System.out.println("A porcentagem de pessoas entrevistadas que assistem o canal 4 é: " + porcentagemAudiencia4 + "%");
        System.out.println("A porcentagem de pessoas entrevistadas que assistem o canal 5 é: " + porcentagemAudiencia5 + "%");
        System.out.println("A porcentagem de pessoas entrevistadas que assistem o canal 9 é: " + porcentagemAudiencia9 + "%");
        System.out.println("A porcentagem de pessoas entrevistadas que assistem o canal 12 é: " + porcentagemAudiencia12 + "%");

        s.close();
    }

    public static void main(String[] args) {
        new Ex18();
    }
}
