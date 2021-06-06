package solution.level_1;

/**
 * #68935
 * url : https://programmers.co.kr/learn/courses/30/lessons/68935
 *
 * 3진법 뒤집기
 */

public class Ex_68935 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder buffer = new StringBuilder();

        while (n > 0) {
            buffer.append(n % 3);
            n /= 3;
        }

        String number = buffer.toString();
        String[] array = number.split("");
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]) * Math.pow(3, number.length() - i - 1);
        }

        return answer;
    }
}
