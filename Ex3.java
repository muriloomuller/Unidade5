public class Ex3 {
    public Ex3() {

        double soma = 0;

        for (int n = 1; n <= 100; n++) {
            soma += 1.0 / n;
        }

        System.out.println(soma);
    }
    public static void main(String[] args) {
        new Ex3();
    }
}
