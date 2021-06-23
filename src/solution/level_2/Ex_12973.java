package solution.level_2;

import java.util.Stack;

/**
 * #12973
 * url : https://programmers.co.kr/learn/courses/30/lessons/12973
 *
 * 짝지어 제거하기
 */

public class Ex_12973 {
    public int solution(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : array) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
