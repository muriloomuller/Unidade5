public class Ex4 {
    public Ex4() {

        double s = 0;
        int num = 3;
        int den = 2;

        for (int i = 0; i <= 20; i++) {
            s += (double) num / den;
            num += 2;
            den += i * 2;
        }
        System.out.println("O valor de S é: " + s);
    }
    public static void main(String[] args) {
        new Ex4();
    }
}
