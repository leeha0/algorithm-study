package startup.chapter1;

public class ExQ_Min4 {

    public int algorithm(int a, int b, int c, int d) {
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
