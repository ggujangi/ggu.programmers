package solution;

/**
 * #12948
 * url : https://programmers.co.kr/learn/courses/30/lessons/12948
 *
 * 핸드폰 번호 가리기
 */

public class Ex_12948 {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
