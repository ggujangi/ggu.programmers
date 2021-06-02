package solution;

import java.util.Arrays;
import java.util.Stack;

/**
 * #12906
 * url : https://programmers.co.kr/learn/courses/30/lessons/12906
 *
 * 같은 숫자는 싫어
 * 효율성 테스트 : 57ms
 */

public class Ex_12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (stack.peek() != i) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
