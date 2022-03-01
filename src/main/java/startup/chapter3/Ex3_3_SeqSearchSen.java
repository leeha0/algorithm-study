package startup.chapter3;

public class Ex3_3_SeqSearchSen {

    public static void main(String[] args) {
        int num = 7;
        int[] x = new int[num + 1];
        x[0] = 22;
        x[1] = 8;
        x[2] = 55;
        x[3] = 32;
        x[4] = 120;
        x[5] = 55;
        x[6] = 70;
        int key = 99;

        int idx = seqSearchSen(x, num, key);

        if (idx == -1) {
            System.out.println("요소를 찾을 수 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    public static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        // 보초 값 추가
        a[n] = key;

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }

        return i == n ? -1 : i;
    }
}
