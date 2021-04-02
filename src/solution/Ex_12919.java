package solution;

/**
 * #12919
 * 서울에서 김서방 찾기
 */

public class Ex_12919 {
    public String solution(String[] seoul) {
        int result = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = i;
                break;
            }
        }

        return "김서방은 " + result + "에 있다";
    }
}
