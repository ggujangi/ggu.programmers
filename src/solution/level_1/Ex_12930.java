package solution.level_1;

/**
 * #12930
 * url : https://programmers.co.kr/learn/courses/30/lessons/12930
 *
 * 이상한 문자 만들기
 */

public class Ex_12930 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] array = s.split("");
        int count = -1;

        for (String str : array) {
            count = str.equals(" ") ? -1 : count + 1;
            answer.append((count % 2 == 0) ? str.toUpperCase() : str.toLowerCase());
        }
        return answer.toString();
    }
}
