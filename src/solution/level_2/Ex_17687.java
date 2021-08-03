package solution.level_2;

/**
 * #17687
 * url : https://programmers.co.kr/learn/courses/30/lessons/17687
 *
 * [3차] n진수 게임
 */

public class Ex_17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder builder = new StringBuilder("0");

        // n 진법 변환
        for (int i = 1; i < t * m; i++) {
            int number = i;
            String s = "";

            while (number > 0) {
                s = convert(number % n) + s;
                number /= n;
            }
            builder.append(s);
        }

        char[] array = builder.toString().toCharArray();

        for (int i = p - 1; i < array.length; i = i + m) {
            if (answer.toString().length() >= t) break;
            answer.append(array[i]);
        }

        return answer.toString();
    }

    private char convert(int mod) {
        return mod < 10 ? (char) (mod + '0') : (char) ('A' - 10 + mod);
    }
}
