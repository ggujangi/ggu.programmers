package solution;

/**
 * #76501
 * url : https://programmers.co.kr/learn/courses/30/lessons/76501
 *
 * 음양 더하기
 */

public class Ex_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }
}
