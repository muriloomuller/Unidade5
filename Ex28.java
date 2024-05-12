import java.util.Scanner;

public class Ex28 {
    public Ex28() {
        Scanner s = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int cTotal = 0;

        while (true) {
            System.out.println("Informe o seu voto\n1 - (Nenhum de Nós)\n2 - (CPM22)\n3 - (Skank)\n4 - (Jota Quest)");
            int voto = s.nextInt();

            switch (voto) {
                case 1:
                    c1++;
                    cTotal++;
                    break;
                case 2:
                    c2++;
                    cTotal++;
                    break;
                case 3:
                    c3++;
                    cTotal++;
                    break;
                case 4:
                    c4++;
                    cTotal++;
                    break;
            }
            System.out.println("Mais um voto?\ns para SIM \nn NÃO");
            String sn = s.next();
            char snn = sn.toUpperCase().charAt(0);

            if (snn == 'N') {
                break;
            }
        }

        float p1 = ((float) c1 / cTotal) * 100;
        float p2 = ((float) c2 / cTotal) * 100;
        float p3 = ((float) c3 / cTotal) * 100;
        float p4 = ((float) c4 / cTotal) * 100;

        System.out.println("Votos para Nenhum de Nós: " + c1);
        System.out.println("Votos para CPM22: " + c2);
        System.out.println("Votos para Skank: " + c3);
        System.out.println("Votos para Jota Quest: " + c4);
        System.out.println("Porcentagem de votos para Nenhum de Nós: " + p1 + "%");
        System.out.println("Porcentagem de votos para CPM22: " + p2 + "%");
        System.out.println("Porcentagem de votos para Skank: " + p3 + "%");
        System.out.println("Porcentagem de votos para Jota Quest: " + p4 + "%");

        String bandaVencedora = "";

        int bandaVencedora0 = Math.max(c1, c2);
        int bandaVencedora1 = Math.max(c3, c4);
        int bandaVencedoraS = Math.max(bandaVencedora0, bandaVencedora1);

        if (bandaVencedoraS == c1) {
            bandaVencedora = "Nenhum de Nós";
        } else if (bandaVencedoraS == c2) {
            bandaVencedora = "CPM22";
        } else if (bandaVencedoraS == c3) {
            bandaVencedora = "Skank";
        } else if (bandaVencedoraS == c4) {
            bandaVencedora = "Jota Quest";
        }

        System.out.println("Com " + bandaVencedoraS + " votos, a banda " + bandaVencedora + " venceu a votação.");

        s.close();
    }

    public static void main(String[] args) {
        new Ex28();
    }
}
