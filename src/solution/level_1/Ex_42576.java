package solution.level_1;

import java.util.HashMap;
import java.util.Map;

/**
 * #42576
 * url : https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * 완주하지 못한 선수
 */

public class Ex_42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        for (String s : participant) {
            map.put(s, map.get(s) == null ? 0 : map.get(s) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) answer = key;
        }
        return answer;
    }
}
