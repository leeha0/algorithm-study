package startup.greedy;

import java.util.Arrays;

/**
 * 모험가 N명을 대상으로 공포도를 측정한 뒤 공포도 만큼의 인원으로 구성된 그룹에 참여하여 여행하도록 규정했다.
 * 최대 몇 개의 그룹이 생성이 가능한가?
 */
public class AdventureGuild {

    public static void main(String[] args) {
        int[] fearLevel = {2, 3, 1, 2, 2};

        Arrays.sort(fearLevel);
        int group = 0;
        int member = 0;
        for (int fear : fearLevel) {
            member++;
            if (fear <= member) {
                group++;
                member = 0;
            }
        }

        System.out.println("group = " + group);
    }

}
