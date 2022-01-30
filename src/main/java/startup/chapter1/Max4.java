package startup.chapter1;

public class Max4 {

    public int algorithm(int a, int b, int c, int d) {
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
