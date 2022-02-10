package startup.chapter1;

public class ExQ3_Min4 {

    public int algorithm(int a, int b, int c, int d) {
        System.out.println("네 값의 최솟값을 구하시오.");
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        return min;
    }
}
