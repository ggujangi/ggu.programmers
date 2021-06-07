package solution.level_2;

/**
 * #12951
 * url : https://programmers.co.kr/learn/courses/30/lessons/12951
 *
 * JadenCase 문자열 만들기
 */

public class Ex_12951 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        boolean isBlank = true;
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                isBlank = true;
                answer.append(c);
            } else if (isBlank && (c >= 'a' && c <= 'z')) {
                answer.append((char) (c - 32));
                isBlank = false;
            } else {
                answer.append(c);
                isBlank = false;
            }
        }

        return answer.toString();
    }
}
