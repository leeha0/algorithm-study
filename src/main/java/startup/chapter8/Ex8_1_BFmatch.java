package startup.chapter8;

public class Ex8_1_BFmatch {

    public static void main(String[] args) {
        String txt = "ABABCDEFGHA";
        System.out.println("텍스트 : " + txt);

        String pat = "ABC";
        System.out.println("패턴 : " + pat);

        int idx = bfMatch(txt, pat);
        if (idx == -1) {
            System.out.println("텍스트에 패턴이 없습니다.");
        } else {
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += txt.substring(i, i + 1).getBytes().length;
            }
            len += pat.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println(txt);
            System.out.printf(String.format("%%%ds\n", len), pat);
        }
    }

    public static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }

        if (pp == pat.length()) {
            return pt - pp;
        }
        return -1;
    }
}
