public class Ex10 {
    public Ex10() {

        int num = 0;

        for (int i = 1; num < 10; i++) {

            int p1 = i / 100;
            int p2 = i % 100;

            if ((p1 + p2) * (p1 + p2) == i && i >= 1) {
                System.out.println(i);
                num++;
            }
        }
    }

    public static void main(String[] args) {
        new Ex10();
    }
}
