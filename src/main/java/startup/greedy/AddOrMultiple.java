package startup.greedy;

/**
 * 0 부터 9 사이의 숫자로 이루어진 문자열 사이에 곱하기 혹은 더하기를 수행하여 가장 큰 수를 구하시오.
 */
public class AddOrMultiple {

    public static void main(String[] args) {
        String n = "1023456789";
        long result = 0;

        result = n.charAt(0) - '0';
        for (int i = 1; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println("result = " + result);
    }

}
