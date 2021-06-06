package solution.level_1;

/**
 * #70128
 * url : https://programmers.co.kr/learn/courses/30/lessons/70128
 *
 * 내적
 */

public class Ex_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
