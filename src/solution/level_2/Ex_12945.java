package solution.level_2;

import java.util.Arrays;

/**
 * #12945
 * url : https://programmers.co.kr/learn/courses/30/lessons/12945
 *
 * 피보나치 수
 */

public class Ex_12945 {
    public int solution(int n) {
        int[] array = new int[n + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[n];
    }
}
