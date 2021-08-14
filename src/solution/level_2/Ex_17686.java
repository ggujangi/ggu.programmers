package solution.level_2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * #17686
 * url : https://programmers.co.kr/learn/courses/30/lessons/17686
 *
 * [3차] 파일명 정렬
 */
public class Ex_17686 {
    public String[] solution(String[] files) {
        String[] answer = files;
        Arrays.sort(answer, comparable);
        return answer;
    }

    Comparator<String> comparable = (o1, o2) -> {
        String head1 = o1.split("[0-9]")[0].toLowerCase();
        String head2 = o2.split("[0-9]")[0].toLowerCase();

        int result = head1.compareTo(head2);

        if (result == 0) {
            int number1 = convert(o1, head1);
            int number2 = convert(o2, head2);

            result = Integer.compare(number1, number2);
        }

        return result;
    };

    private int convert(String s, String head) {
        StringBuilder number = new StringBuilder();
        s = s.substring(head.length());
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                number.append(c);
            } else {
                break;
            }
        }

        return Integer.parseInt(number.toString());
    }
}
