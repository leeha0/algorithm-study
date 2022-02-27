package startup.chapter8;

public class Ex8_2_IndexOfTester {

    public static void main(String[] args) {
        String txt = "ABABCDEFGHABC";
        System.out.println("텍스트 : " + txt);

        String pat = "ABC";
        System.out.println("패턴 : " + pat);

        int frontIdx = txt.indexOf(pat);
        int lastIdx = txt.lastIndexOf(pat);

        if (frontIdx == -1) {
            System.out.println("텍스트 안에 패턴이 없습니다.");
        } else {
            int len1 = 0;
            for (int i = 0; i < frontIdx; i++) {
                len1 += txt.substring(i, i + 1).getBytes().length;
            }
            len1 += pat.length();

            int len2 = 0;
            for (int i = 0; i < lastIdx; i++) {
                len2 += txt.substring(i, i + 1).getBytes().length;
            }
            len2 += pat.length();

            System.out.println(txt);
            System.out.printf(String.format("%%%ds\n", len1), pat);

            System.out.println(txt);
            System.out.printf(String.format("%%%ds\n", len2), pat);
        }

    }
}
