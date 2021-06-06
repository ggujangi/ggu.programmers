package solution.level_1;

/**
 * #12947
 * url : https://programmers.co.kr/learn/courses/30/lessons/12947
 *
 * 하샤드 수
 */

public class Ex_12947 {
    public boolean solution(int x) {
        int sum = (x / 10000) +
                (x % 10000) / 1000 +
                (x % 1000) / 100 +
                (x % 100) / 10 +
                (x % 10);

        return x % sum == 0;
    }
}
