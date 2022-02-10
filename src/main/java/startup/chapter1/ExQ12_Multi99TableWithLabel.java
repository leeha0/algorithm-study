package startup.chapter1;

public class ExQ12_Multi99TableWithLabel {

    //    | 1 2 3 4 5
    // ---+----------
    //   1| 1 2 3 4 5
    //   2| 2 4 6 8 10
    public static void main(String[] args) {
        System.out.println("1단부터 9단까지 곱셈표를 작성하시오.");
        System.out.println("구분선은 수직선 기호(|), 마이너스 기호(-), 플러스 기호(+)를 사용하세요.");

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
                            System.out.printf("%3d", i * j);
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}
