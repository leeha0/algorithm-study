package startup.chapter2;

public class Ex2_3_CloneArray {

    public static void main(String[] args) {
        System.out.println("배열을 복제하시오.");
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println(a);
        System.out.println("a =");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }

        System.out.println(b);
        System.out.println("\nb =");
        for (int i = 0; i < b.length; i++) {
            System.out.println(" " + b[i]);
        }
    }
}
