package solution;

/**
 * #12922
 * 수박수박수박수박수박수?
 */

public class Ex_12922 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            answer.append((i % 2 == 0) ? "수" : "박");
        }
        return answer.toString();
    }
}
