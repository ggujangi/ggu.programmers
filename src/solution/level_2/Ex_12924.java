package solution.level_2;

/**
 * #12924
 * url : https://programmers.co.kr/learn/courses/30/lessons/12924
 *
 * 숫자의 표현
 * 효율성 테스트 : 1.75ms
 */

public class Ex_12924 {
    public int solution(int n) {
        int answer = 0;

        int index = 1, sum = 0;

        while (index <= n) {
            for (int i = index; i <= n; i++) {
                sum += i;
                if (sum == n) answer++;
                else if (sum > n) break;
            }
            sum = 0;
            index++;
        }

        return answer;
    }
}
