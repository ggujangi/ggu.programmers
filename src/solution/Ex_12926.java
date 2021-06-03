package solution;

/**
 * #12926
 * url : https://programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 시저 암호
 */

public class Ex_12926 {
    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();

        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) + n;
            if (s.charAt(i) == ' ') builder.append(" ");
            else if (c > 'z') {
                int diff = c - 'z';
                builder.append((char) ('a' + diff - 1));
            } else if (c > 'Z' && s.charAt(i) <= 'Z') {
                int diff = c - 'Z';
                builder.append((char) ('A' + diff - 1));
            } else {
                builder.append((char) c);
            }
        }

        return builder.toString();
    }
}
