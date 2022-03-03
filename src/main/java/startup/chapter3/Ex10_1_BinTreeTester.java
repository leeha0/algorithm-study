package startup.chapter3;

import java.util.Scanner;

public class Ex10_1_BinTreeTester {

    static Scanner stdIn = new Scanner(System.in);

    static class Data {

        public static final int NO = 1;
        public static final int NAME = 2;

        private Integer no;
        private String name;

        public Integer keyCode() {
            return no;
        }

        public String toString() {
            return name;
        }

        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요.");

            if ((sw & NO) == NO) {
                System.out.print("번호 : ");
                no = stdIn.nextInt();
            }

            if ((sw & NAME) == NAME) {
                System.out.print("이름 : ");
                name = stdIn.next();
            }
        }
    }

    enum Menu {
        ADD("삽입"), REMOVE("삭제"), SEARCH("검색"), PRINT("표시"), TERMINATE("종료");

        private final String message;

        static Menu MenuAt(int idx) {
            for (Menu m : Menu.values()) {
                if (m.ordinal() == idx) {
                    return m;
                }
            }
            return null;
        }

        Menu(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    static Menu selectMenu() {
        int key;
        do {
            for (Menu m : Menu.values()) {
                System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
            }
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu;
        Data data;
        Data ptr;
        Data temp = new Data();
        Ex10_1_BinTree<Integer, Data> tree = new Ex10_1_BinTree<>();

        do {
            switch (menu = selectMenu()) {
                case ADD:
                    data = new Data();
                    data.scanData("삽입", Data.NO | Data.NAME);
                    tree.add(data.keyCode(), data);
                    break;
                case REMOVE:
                    temp.scanData("삭제", Data.NO);
                    tree.remove(temp.keyCode());
                    break;
                case SEARCH:
                    temp.scanData("검색", Data.NO);
                    ptr = tree.search(temp.keyCode());
                    if (ptr != null) {
                        System.out.println("그 번호의 이름은 " + ptr + "입니다.");
                    } else {
                        System.out.println("해당 데이터가 없습니다.");
                    }
                    break;
                case PRINT:
                    tree.print();
                    break;
            }
        } while (menu != Menu.TERMINATE);
    }
}
