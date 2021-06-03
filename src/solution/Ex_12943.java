package solution;

/**
 * #12943
 * url : https://programmers.co.kr/learn/courses/30/lessons/12943
 *
 * 콜라츠 추측
 */

public class Ex_12943 {
    public int solution(int num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }

            answer++;

            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
