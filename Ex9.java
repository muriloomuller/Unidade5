import java.util.Scanner;

public class Ex9 {
    public Ex9() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de alunos da turma: ");
        int numeroAlunos = scan.nextInt();

        int cont = 0;

        for (int i = 0; i < numeroAlunos; i++) {

            System.out.println("Digite o nome do aluno: ");
            String nome = scan.next();

            System.out.println("Digite a idade do aluno: ");
            int idade = scan.nextInt();
            
            if (idade >= 18) {
                System.out.println(nome + " tem 18 anos ou mais");
            }
            if (idade >= 20) {
                cont++;
            }
        }
        System.out.println(cont + " alunos tem acima de 20 anos");
        scan.close();
    }
    public static void main(String[] args) {
        new Ex9();
    }
}
