package solution;

/**
 * #12928
 * url : https://programmers.co.kr/learn/courses/30/lessons/12928
 *
 * 약수의 합
 */

public class Ex_12928 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }
}
