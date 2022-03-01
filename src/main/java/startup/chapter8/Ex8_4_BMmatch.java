package startup.chapter8;

public class Ex8_4_BMmatch {

    public static void main(String[] args) {
        String txt = "ABCXDEZCABACABAC";
        System.out.println("텍스트 : " + txt);

        String pat = "ABAC";
        System.out.println("패턴 : " + pat);

        int idx = bmMatch(txt, pat);
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

    public static int bmMatch(String txt, String pat) {
        // 표 생성
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1];

        for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
            skip[pt] = patLen;
        }

        for (pt = 0; pt < patLen - 1; pt++) {
            skip[pat.charAt(pt)] = patLen - pt - 1;
        }

        // 검색
        while (pt < txtLen) {
            pp = patLen - 1;

            while (txt.charAt(pt) == pat.charAt(pp)) {
                if (pp == 0) {
                    return pt;
                }
                pp--;
                pt--;
            }
            pt += Math.max(skip[txt.charAt(pt)], patLen - pp);
//          pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
//          pt += skip[txt.charAt(pt)];
        }

        return -1;
    }
}
