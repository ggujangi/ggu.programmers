package solution.level_1;

/**
 * #12912
 * url : https://programmers.co.kr/learn/courses/30/lessons/12912
 *
 * 두 정수 사이의 합
 */

public class Ex_12912 {
    public long solution(int a, int b) {
        if (a == b) return a;
        return (long) (Math.max(a, b) - Math.min(a, b) + 1) * (a + b) / 2;
    }
}
