package solution.level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * #68644
 * url : https://programmers.co.kr/learn/courses/30/lessons/68644
 *
 * 두 개 뽑아서 더하기
 */

public class Ex_68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            answer[i] = integer;
            i++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
