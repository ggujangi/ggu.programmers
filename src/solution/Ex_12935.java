package solution;

import java.util.Arrays;

/**
 * #12935
 * url : https://programmers.co.kr/learn/courses/30/lessons/12935
 *
 * 제일 작은 수 제거하기
 */

public class Ex_12935 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
