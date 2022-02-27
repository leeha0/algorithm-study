package startup.chapter6;

public class Ex6_16_HeapSort {

    public static void main(String[] args) {
        int[] a = {22, 5, 11, 32, 120, 68, 70, 1};
        int n = a.length;

        System.out.println("바텀-업 방식의 힙 정렬을 구현하시오.");

        // 최초 정렬
        // 루트 = (i - 1) / 2
        // 왼쪽 노드 = (i * 2) + 1
        // 오른쪽 노드 = (i * 2) + 2
        for (int i = (n - 1) / 2; i >= 0; i--) {
            downHeap(a, i, n - 1);
        }

        // 마지막 요소를 꺼내고 다시 힙 정렬
        for (int i = n - 1; i > 0; i--) {
            // 마지막 요소를 상위로 전달
            swap(a, 0, i);
            // 모든 하위 요소는 형재 힙 정렬이 된 상태이기 때문에 바로 루트부터 정렬
            downHeap(a, 0, i - 1);
        }

        System.out.println("오름차순으로 정렬한 결과입니다.");
        for (int i : a) {
            System.out.printf("%5d", i);
        }
        System.out.println();
    }

    private static void downHeap(int[] a, int left, int right) {
        int temp = a[left];
        int child;
        int parent;

        // (right + 1) / 2 = 자식이 한개인 루트 노드를 처리하기 위해
        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl;

            if (temp >= a[child]) {
                break;
            }
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}
