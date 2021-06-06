package solution;

import java.util.Arrays;

/**
 * #42748
 * url : https://programmers.co.kr/learn/courses/30/lessons/42748
 *
 * K번째수
 */

public class Ex_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0 ;

        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int k = command[2];

            int[] tmp = new int[end - start + 1];

            int a = 0;
            for (int j = start - 1; j < end; j++)
                tmp[a++] = array[j];

            Arrays.sort(tmp);

            answer[index++] = tmp[k - 1];
        }

        return answer;
    }
}
