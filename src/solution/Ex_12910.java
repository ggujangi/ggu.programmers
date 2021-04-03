package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #12910
 * 나누어 떨어지는 숫자 배열
 */

public class Ex_12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if (a % divisor == 0) list.add(a);
        }

        if (list.size() == 0) return new int[]{-1};

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        Arrays.sort(result);

        return result;
    }
}
