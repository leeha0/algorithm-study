package codility.verse2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        // 새로운 사이즈만큼 배열을 복사하여 생성
        arrayList.add(1);

        LinkedList<Integer> linkedList = new LinkedList<>();
        // 새로운 노드의 주소를 연결하는 방법으로 생성
        // first, last 노드 연결
        linkedList.add(1);
        // next, last 노드 연결
        linkedList.add(2);
    }
}
