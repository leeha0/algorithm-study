package startup.chapter1;

public class Ex1_7_Multi99Table {

    public static void main(String[] args) {
        System.out.println("1단부터 9단까지 구구단을 출력하시오.");
        System.out.println("곱셈표");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
