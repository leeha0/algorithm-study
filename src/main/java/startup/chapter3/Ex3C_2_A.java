package startup.chapter3;

public class Ex3C_2_A implements Comparable<Ex3C_2_A> {

    @Override
    public int compareTo(Ex3C_2_A o) {
        // this 보다 o가 크면 양의 값 반환
        // this 보다 o가 작으면 음의 값 반환
        // this와 o가 같으면 0 반환
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // this가 obj와 같으면 true 반환
        // this가 obj와 같지 않으면 false 반환
        return super.equals(obj);
    }
}
