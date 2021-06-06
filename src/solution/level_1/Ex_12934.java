package solution.level_1;

/**
 * #12934
 * url : https://programmers.co.kr/learn/courses/30/lessons/12934
 *
 * 정수 제곱근 판별
 */

public class Ex_12934 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return (sqrt - (int) sqrt) > 0 ? -1 : (long) Math.pow(sqrt + 1, 2);
    }
}
