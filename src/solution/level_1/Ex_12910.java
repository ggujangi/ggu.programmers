package solution.level_1;

import java.util.Arrays;

/**
 * #12910
 * url : https://programmers.co.kr/learn/courses/30/lessons/12910
 *
 * 나누어 떨어지는 숫자 배열
 */

public class Ex_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).sorted().filter(i -> i % divisor == 0).toArray();
        if (result.length == 0) return new int[]{-1};
        return result;
    }
}
