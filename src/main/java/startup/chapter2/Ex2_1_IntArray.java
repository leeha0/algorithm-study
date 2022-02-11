package startup.chapter2;

public class Ex2_1_IntArray {

    public static void main(String[] args) {
        System.out.println("구성 요소의 자료형이 Int형인 배열을 생성하시오.");
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
