package solution;

import java.util.Arrays;

/**
 * #12933
 * url : https://programmers.co.kr/learn/courses/30/lessons/12933
 *
 * 정수 내림차순으로 배치하기
 */

public class Ex_12933 {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        StringBuilder builder = new StringBuilder();

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]);
        }

        return Long.parseLong(builder.toString());
    }
}
