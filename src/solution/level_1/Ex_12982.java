package solution.level_1;

import java.util.Arrays;

/**
 * #12982
 * url : https://programmers.co.kr/learn/courses/30/lessons/12982
 *
 * 예산
 */

public class Ex_12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i : d) {
            budget -= i;
            if (budget < 0) break;
            else answer++;
        }

        return answer;
    }
}
