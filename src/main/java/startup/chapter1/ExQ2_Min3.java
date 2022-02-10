package startup.chapter1;

public class ExQ2_Min3 {

    public int algorithm(int a, int b, int c) {
        System.out.println("세 값의 최솟값을 구하시오.");
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }
}
