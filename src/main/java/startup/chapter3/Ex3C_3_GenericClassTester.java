package startup.chapter3;

import startup.chapter3.GenericClassTester.GenericClass;

class GenericClassTester {

    static class GenericClass<T> {

        private T xyz;

        GenericClass(T t) {
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }
    }
}

public class Ex3C_3_GenericClassTester {

    public static void main(String[] args) {
        // String, Integer 타입 모두 설정 가능
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
