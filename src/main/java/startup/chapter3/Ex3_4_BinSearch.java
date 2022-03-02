package startup.chapter3;

public class Ex3_4_BinSearch {

    public static void main(String[] args) {
        int[] x = {15, 27, 39, 77, 92, 108, 121};
        int key = 108;

        int idx = binSearch(x, x.length, key);

        if (idx == -1) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    public static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }
}
