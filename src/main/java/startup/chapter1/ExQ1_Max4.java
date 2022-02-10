package startup.chapter1;

public class ExQ1_Max4 {

    public int algorithm(int a, int b, int c, int d) {
        System.out.println("네 값의 최댓값을 구하시오.");
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }
}
