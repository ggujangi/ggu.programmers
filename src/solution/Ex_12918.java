package solution;

/**
 * #12918
 * 문자열 다루기 기본
 */

public class Ex_12918 {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
