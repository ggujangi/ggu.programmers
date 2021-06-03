package solution;

import java.util.Arrays;

/**
 * #12917
 * url : https://programmers.co.kr/learn/courses/30/lessons/12917
 *
 * 문자열 내림차순으로 배치하기
 */

public class Ex_12917 {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);

        return new StringBuilder(new String(array)).reverse().toString();
    }
}
