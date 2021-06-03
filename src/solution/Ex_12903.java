package solution;

/**
 * #12903
 * url : https://programmers.co.kr/learn/courses/30/lessons/12903
 *
 * 가운데 글자 가져오기
 */

public class Ex_12903 {
    public String solution(String s) {
        int length = s.length();
        return (length % 2 == 0) ?
                String.valueOf(s.charAt((length - 1) / 2)) + s.charAt((length - 1) / 2 + 1) :
                String.valueOf(s.charAt(length / 2));
    }
}
