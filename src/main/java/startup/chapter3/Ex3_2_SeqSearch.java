package startup.chapter3;

public class Ex3_2_SeqSearch {

    public static void main(String[] args) {
        int[] x = {22, 8, 55, 32, 120, 55, 70};
        int key = 120;

        int idx = seqSearch(x, x.length, key);

        if (idx == -1) {
            System.out.println("요소를 찾을 수 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
