package solution.level_2;

import java.util.Arrays;

/**
 * #12941
 * url : https://programmers.co.kr/learn/courses/30/lessons/12941
 *
 * 최솟값 만들기
 */

public class Ex_12941 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        return answer;
    }
}
