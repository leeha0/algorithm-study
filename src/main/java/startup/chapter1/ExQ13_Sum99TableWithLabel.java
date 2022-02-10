package startup.chapter1;

public class ExQ13_Sum99TableWithLabel {

    //    | 1 2 3 4 5
    // ---+----------
    //   1| 1 3 4 5 6
    //   2| 3 4 5 6 7
    public static void main(String[] args) {
        System.out.println("곱셈표가 아닌 덧셈표를 출력하시오.");

        for (int i = -1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == -1) {
                    if (j == 0) {
                        System.out.printf("%3s|", "");
                    } else {
                        System.out.printf("%3d", j);
                    }
                } else {
                    if (i == 0) {
                        System.out.print("---");

                        if (j == 0) {
                            System.out.print("+");
                        }
                    } else {
                        if (j == 0) {
                            System.out.printf("%3d|", i);
                        } else {
                            System.out.printf("%3d", i + j);
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}
