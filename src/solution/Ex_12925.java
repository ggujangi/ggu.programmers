package solution;

/**
 * #12925
 * url : https://programmers.co.kr/learn/courses/30/lessons/12925
 *
 * 문자열을 정수로 바꾸기
 */

public class Ex_12925 {
    public int solution(String s) {
        boolean isMinus = false;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                isMinus = true;
            } else if (c != '+') {
                result = result * 10 + (c - '0');
            }
        }

        return (isMinus ? -1 : 1) * result;
    }
}
