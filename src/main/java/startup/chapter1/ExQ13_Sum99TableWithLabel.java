package startup.chapter1;

public class ExQ13_Sum99TableWithLabel {

    public static void main(String[] args) {
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
