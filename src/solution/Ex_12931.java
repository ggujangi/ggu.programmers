package solution;

/**
 * #12931
 * 자릿수 더하기
 */

public class Ex_12931 {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");

        for (String s : array) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
