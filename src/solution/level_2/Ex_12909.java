package solution.level_2;

import java.util.Stack;

/**
 * #12909
 * url : https://programmers.co.kr/learn/courses/30/lessons/12909
 *
 * 올바른 괄호
 */

public class Ex_12909 {
    public boolean solution(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : array) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
