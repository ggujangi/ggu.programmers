package solution.level_1;

import java.util.Arrays;

/**
 * #12919
 * url : https://programmers.co.kr/learn/courses/30/lessons/12919
 *
 * 서울에서 김서방 찾기
 */

public class Ex_12919 {
    public String solution(String[] seoul) {
        int result = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + result + "에 있다";
    }
}
