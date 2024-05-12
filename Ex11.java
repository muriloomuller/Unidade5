import java.util.Scanner;

public class Ex11 {
    public Ex11() {

        Scanner scan = new Scanner(System.in);
        
        int horas = 16;
        int biscoitos = 1;
        int biscoitosQuebradosDia = 0;

        for (int i = 0; i <= horas; i++) {
            biscoitosQuebradosDia += biscoitos;
            biscoitos *= 3;
        }

        System.out.println("São quebrados " + biscoitosQuebradosDia + " biscoitos por dia");
        scan.close();
    }

    public static void main(String[] args) {
        new Ex11();
    }
}
