package solution;

import java.util.Arrays;

/**
 * #12944
 * 평균 구하기
 */

public class Ex_12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
