package startup.chapter3;

import java.util.Arrays;

public class Ex3_5_StringBinarySearch {

    public static void main(String[] args) {
        String[] x = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
        };
        String key = "try";

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println(key + " 키워드는 x[" + idx + "]에 있습니다.");
        }

    }
}
