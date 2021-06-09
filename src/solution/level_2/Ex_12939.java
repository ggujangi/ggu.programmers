package solution.level_2;

/**
 * #12939
 * url : https://programmers.co.kr/learn/courses/30/lessons/12939
 *
 * 최댓값과 최솟값
 */

public class Ex_12939 {
    public String solution(String s) {
        String[] array = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String n : array) {
            int value = Integer.parseInt(n);
            if(min > value) min = value;
            if(max < value) max = value;
        }

        return min + " " + max;
    }
}
