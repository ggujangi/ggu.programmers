package solution;

import java.util.Arrays;

/**
 * #12915
 * 문자열 내 마음대로 정렬하기
 */

public class Ex_12915 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
