public class Ex22 {
    public Ex22() {

        int ano = 1995;
        int salario = 2000;
        float aumento = 0.015f;

        while (ano != 2024) {
            ano++;
            salario += salario * aumento;
            aumento *= 2;
        }

        System.out.println("O salário atual (2024) é : R$" + salario);

    }
    public static void main(String[] args) {
        new Ex22();
    }
}
