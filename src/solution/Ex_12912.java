package solution;

/**
 * #12912
 * 두 정수 사이의 합
 */

public class Ex_12912 {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}
