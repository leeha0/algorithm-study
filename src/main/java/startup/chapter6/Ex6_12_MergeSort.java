package startup.chapter6;

public class Ex6_12_MergeSort {

    static int[] buff;

    public static void main(String[] args) {
        int[] a = {5, 6, 4, 8, 3, 7, 9, 0, 1, 5, 2, 3};

        System.out.println("병합 정렬을 구현하시오.");
        mergeSort(a, a.length);

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }

    public static void mergeSort(int[] a, int n) {
        buff = new int[n];

        __mergeSort(a, 0, n - 1);

        buff = null;
    }

    public static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(a, left, center);
            __mergeSort(a, center + 1, right);

            // 좌측 배열을 임시 배열에 복사
            // buff = 좌측 배열의 임시 저장소
            // i = 정렬된 좌측 배열의 인덱스
            // center = 정렬된 좌측 배열의 종료 인덱스
            // p = 버퍼 인덱스
            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            // 비교 및 정렬
            // i = 정렬된 우측 배열에서 요소를 꺼낸 인덱스
            // j = 정렬된 버퍼(좌측 배열)에서 요소를 꺼낸 인덱스
            // a = 병합된 인덱스
            // i <= right = 우측 배열에 남은 요소가 있다면
            // j < p = 버퍼(좌측 배열)에 남은 요소가 있다면
            while (i <= right && j < p) {
                // buff[j] <= a[i] = 좌측 배열 값과 우측 배열 값 중 작은 값을 병합된 정렬에 입력
                a[k++] = (buff[j] <= a[i] ? buff[j++] : a[i++]);
            }

            // 좌측 또는 우측 배열 중 남은 요소 복사
            // j = 버퍼에서 요소를 꺼낸 인덱스
            // p = 버퍼 인덱스
            // j < p = 버퍼(좌측 배열)에 아직 안꺼낸 요소가 있다면?
            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

//    public static void __mergeSort(int[] a, int left, int right) {
//        if (left < right) {
//            // 분할
//            int i;
//            int k = left;
//
//            int center = left + right / 2;
//            int p = 0;
//            int pf = left;
//            int pb = center + 1;
//
//            __mergeSort(a, left, center);
//            __mergeSort(a, center + 1, right);
//
//            // 정렬
//            // 버퍼에 앞부분 배열을 모두 입력
//            for (i = left; i <= center; i++) {
//                buff[p++] = a[i];
//            }
//
//            // 버퍼의 빈 부분에
//            while (i <= right) {
//                buff[p++] = a[pf] <= a[pb] ? a[pf++] : a[pb++];
//            }
//
//            while (pf <= center) {
//                buff[p++] = a[pf++];
//            }
//
//            while (pb <= right) {
//                buff[p++] = a[pb++];
//            }
//        }
//    }
}
