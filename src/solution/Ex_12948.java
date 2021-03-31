package solution;

/**
 * #12948
 * 핸드폰 번호 가리기
 */

public class Ex_12948 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {
            if (i >= phone_number.length() - 4) answer.append(phone_number.charAt(i));
            else answer.append("*");

        }
        return answer.toString();
    }
}
