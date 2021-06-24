package solution.level_2;

/**
 * #12911
 * url : https://programmers.co.kr/learn/courses/30/lessons/12911
 *
 * 다음 큰 숫자
 */

public class Ex_12911 {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int compare = n + 1;

        while (Integer.bitCount(compare) != count) {
            compare++;
        }

        return compare;
    }
}
