package solution.level_1;

/**
 * #77484
 * url : https://programmers.co.kr/learn/courses/30/lessons/77484
 *
 * 로또의 최고 순위와 최저 순위
 */

public class Ex_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0, matchCount = 0;

        for (int l : lottos) {
            for (int w : win_nums) {
                if (l == 0) {
                    zeroCount++;
                    break;
                } else if (l == w) {
                    matchCount++;
                    break;
                }
            }
        }

        int totalCnt = zeroCount + matchCount;
        if (totalCnt == 0) totalCnt++;
        answer[0] = totalCnt - (2 * (totalCnt - 5) + 3);

        if (matchCount == 0) matchCount++;
        answer[1] = matchCount - (2 * (matchCount - 5) + 3);

        return answer;
    }
}
