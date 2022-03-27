package startup.greedy;

/**
 * 거스러 줄 수 있는 동전의 개수는?
 *
 * 화폐의 종류 K 시간 복잡도는 O(K)
 */
public class ChangeCoin {

    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int change = 1760; // 500, 500, 500, 100, 100, 50, 10
        int count = 0;

        for (int coin : coins) {
            count += (change / coin);
            change %= coin;
        }

        System.out.println("count = " + count);
    }

}
