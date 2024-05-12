public class Ex2 {
    public Ex2() {

        int somapar = 0;
        int somaimpar = 0;

        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                somapar += n;
            } else {
                somaimpar += n;

            }
        }
        System.out.println("A totalidade dos números pares de 1 até 100 resulta em:" + somapar);
        System.out.println("A totalidade dos números ímpares de 1 até 100 resulta em" + somaimpar);
    }
    public static void main(String[] args) {
        new Ex2();
    }
}
