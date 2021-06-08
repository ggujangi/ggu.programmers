package solution.level_2;

/**
 * #12953
 * url : https://programmers.co.kr/learn/courses/30/lessons/12953
 *
 * N개의 최소공배수
 */

public class Ex_12953 {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int gcd = gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd;
        }

        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
