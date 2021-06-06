package solution.level_1;

import java.util.HashSet;
import java.util.Set;

/**
 * #1845
 * url : https://programmers.co.kr/learn/courses/30/lessons/1845
 *
 * 폰켓몬
 */

public class Ex_1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int n : nums) set.add(n);

        return Math.min(nums.length/2, set.size());
    }
}
