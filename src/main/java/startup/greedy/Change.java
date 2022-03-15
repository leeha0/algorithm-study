package startup.greedy;

public class Change {

    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int change = 1760; // 500, 500, 500, 100, 100, 50, 10
        int count = 0;

        while (change > 0) {
            for (int coin : coins) {
                count += (change / coin);
                change %= coin;
            }
        }

        System.out.println("count = " + count);
    }

}
