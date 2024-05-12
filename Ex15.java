import java.util.Scanner;

public class Ex15 {
    public Ex15() {

        Scanner scan = new Scanner(System.in);

        String nome = "";

        while (nome.equals(nome)) {

            System.out.println("Nome do aluno: ");
            nome = scan.next();

            if (nome.equals("Fim")) {
                break;
            }

            System.out.println("Digite a nota da primeira prova: ");
            float nota1 = scan.nextFloat();
            System.out.println("Digite a nota da segunda prova: ");
            float nota2 = scan.nextFloat();

            float media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno " + nome + " é " + media);
        }
        
        scan.close();
    }
    public static void main(String[] args) {
        new Ex15();
    }
}
