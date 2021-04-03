package solution;

import java.util.Arrays;

/**
 * #12915
 * 문자열 내 마음대로 정렬하기
 */

public class Ex_12915 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) return 1;
            else if (o1.charAt(n) < o2.charAt(n)) return -1;
            return o1.compareTo(o2);
        });

        return strings;
    }
}
