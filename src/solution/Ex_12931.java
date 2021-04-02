package solution;

/**
 * #12931
 * 자릿수 더하기
 */

public class Ex_12931 {
    public int solution(int n) {
        int answer = 0;
        while (true) {
            answer = n % 10 + answer;
            if (n < 10) {
                break;
            }
            n = n / 10;
        }
        return answer;
    }
}
