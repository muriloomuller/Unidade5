import java.util.Scanner;

public class Ex25 {
    public Ex25() {
        Scanner s = new Scanner(System.in);

        int contadorD = 0;
        int contadorE = 0;

        while (true) {
            System.out.println("Quem fez ponto? \nd para Jogador Direito\ne para Jogador Esquerdo");
            String ponto = s.next();
            char pontoO = ponto.toUpperCase().charAt(0);

            switch (pontoO) {
                case 'D':
                    contadorD++;
                    break;
                case 'E':
                    contadorE++;
                    break;
            }

            System.out.println("Jogador Direito " + contadorD + " X " + contadorE + " Jogador Esquerdo");

            if ((contadorD >= 21 || contadorE >= 21) && (Math.abs(contadorD - contadorE) >= 2)) {
                System.out.println("O jogo acabou");
                if (contadorD > contadorE) {
                    System.out.println("Jogador Direito ganhou!");
                } else {
                    System.out.println("Jogador Esquerdo ganhou!");
                }
                break;
            }
        }

        s.close();
    }

    public static void main(String[] args) {
        new Ex25();
    }
}

