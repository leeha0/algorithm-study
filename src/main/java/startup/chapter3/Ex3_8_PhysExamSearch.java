package startup.chapter3;

import java.util.Arrays;
import java.util.Comparator;

public class Ex3_8_PhysExamSearch {

    static class PhyscData {

        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", vision=" + vision +
                '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                // return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
                return Integer.compare(o1.height, o2.height);
            }
        }
    }

    public static void main(String[] args) {
        PhyscData[] x = {
            new PhyscData("이나령", 162, 0.3),
            new PhyscData("유지훈", 168, 0.4),
            new PhyscData("김한결", 169, 0.8),
            new PhyscData("홍준기", 171, 1.5),
            new PhyscData("전서현", 173, 0.7),
            new PhyscData("이호연", 174, 1.2),
            new PhyscData("이수민", 175, 2.0)
        };
        int height = 171;
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
