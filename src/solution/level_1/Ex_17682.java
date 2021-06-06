package solution.level_1;

/**
 * #17682
 * url : https://programmers.co.kr/learn/courses/30/lessons/17682
 *
 * [1차] 다트게임
 */

public class Ex_17682 {
    public int solution(String dartResult) {
        int[] result = new int[dartResult.length()];
        char[] array = dartResult.toCharArray();

        int index = 0, lastNum = 0;

        for (char c : array) {
            switch (c) {
                case 'S', 'D', 'T' -> {
                    Dart dart = new Dart(lastNum, c);
                    result[index] = dart.getPoint();
                    index++;
                    lastNum = 0;
                }
                case '*' -> {
                    if (index - 2 >= 0) result[index - 2] *= 2;
                    result[index - 1] *= 2;
                }
                case '#' -> result[index - 1] *= -1;
                default -> lastNum = lastNum == 0 ? c - '0' : 10;
            }
        }

        int answer = 0;
        for (int i : result) {
            answer += i;
        }

        return answer;
    }

    private class Dart {
        int value;
        char s;
        int point;

        Dart(int value, char s) {
            this.value = value;
            this.s = s;

            switch (s) {
                case 'S' -> this.point = value;
                case 'D' -> this.point = value * value;
                case 'T' -> this.point = value * value * value;
            }
        }

        public int getPoint() {
            return point;
        }
    }
}
