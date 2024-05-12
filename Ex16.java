import java.util.Scanner;

public class Ex16 {
    public Ex16() {
        Scanner s = new Scanner(System.in);

        int somaMulheres = 0;
        int somaGrupos = 0;
        int contadorMulheres = 0;
        int contadorGrupos = 0;
        float altura;
        
        while (true) {
            System.out.println("Informe o seu gênero: ");
            System.out.println("M ou m para masculino \nF ou f para feminino \nO ou o para outro");
            String genero1 = s.next();

            System.out.println("Informe a sua altura, em metros: ");
            altura = s.nextFloat();
            if (altura == 0) {
                break;
            }
            char genero = genero1.toUpperCase().charAt(0);

            switch (genero) {
                case 'F':
                    somaMulheres += altura;
                    contadorMulheres++;
                    break;
                case 'M':
                case 'O':
                    somaGrupos += altura;
                    contadorGrupos++;
                    break;
            }
        }

        float mediamulher = somaMulheres / contadorMulheres;
        float mediagrupo = somaGrupos / contadorGrupos;

        if (altura == 0) {
        System.out.println("A altura média das mulheres do grupo é: " + mediamulher);
        System.out.println("A média de altura do grupo inteiro é: " + mediagrupo);
        }
        s.close();
    }
    public static void main(String[] args) {
        new Ex16();
    }
}
