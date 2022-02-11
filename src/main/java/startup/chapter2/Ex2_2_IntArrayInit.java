package startup.chapter2;

public class Ex2_2_IntArrayInit {

    public static void main(String[] args) {
        System.out.println("배열의 요솟값 초기화하며 선언하시오.");
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
