package programmers;

public class TravelRoute {

    public static String[] solution(String[][] tickets) {
        String[] answer = {};

        for (int i = 0; i < tickets.length; i++) {
            // 출발지가 인천인 경우
            if (tickets[i][0].equals("ICN")) {
                // 깊이 우선 탐색 시작
                dfs(i, tickets);
            }
        }

        return answer;
    }

    public static String[] dfs(int startTickerIndex, String[][] tickets) {
        boolean[] visited = new boolean[tickets.length];
        visited[startTickerIndex] = true;

        String arrival = tickets[startTickerIndex][1];

        for (int i = 0; i < tickets.length; i++) {
            // 출발지가 도착지이면서 아직 사용하지 않은 티켓인경우
            if (tickets[i][0].equals(arrival) && !visited[i]) {
                // dfs(n, i, tickets);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] solution1 = solution(new String[][]{
            {"ICN", "JFK"},
            {"HND", "IAD"},
            {"JFK", "HND"}
        });
        System.out.println("solution1 = " + solution1);

        String[] solution2 = solution(new String[][]{
            {"ICN", "SFO"},
            {"ICN", "ATL"},
            {"SFO", "ATL"},
            {"ATL", "ICN"},
            {"ATL", "SFO"}
        });
        System.out.println("solution2 = " + solution2);
    }

}
