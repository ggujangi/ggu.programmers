package solution;

/**
 * #12947
 * 하샤드 수
 */

public class Ex_12947 {
    private int sum = 0;
    public boolean solution(int x) {
        String.valueOf(x).chars().forEach(c ->
                sum += c - '0'
        );
        return x % sum == 0;
    }
}
