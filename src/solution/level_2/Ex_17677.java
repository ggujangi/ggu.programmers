package solution.level_2;

import java.util.*;
import java.util.regex.Pattern;

/**
 * #17677
 * url : https://programmers.co.kr/learn/courses/30/lessons/17677
 *
 * [1차] 뉴스 클러스터링
 */

public class Ex_17677 {
    public int solution(String str1, String str2) {
        int answer = 0;

        Map<String, Integer> str1Map = new HashMap<String, Integer>();
        Map<String, Integer> str2Map = new HashMap<String, Integer>();

        makeMap(str1Map, str1);
        makeMap(str2Map, str2);

        int total = 0, cross = 0;

        for (String key : str1Map.keySet()) {
            if (str2Map.get(key) == null) total += str1Map.get(key);
            else {
                total += Math.max(str1Map.get(key), str2Map.get(key));
                cross += Math.min(str1Map.get(key), str2Map.get(key));
            }
        }

        for (String key : str2Map.keySet()) {
            if (str1Map.get(key) == null) total += str2Map.get(key);
        }

        if (str1Map.size() == 0 && str2Map.size() == 0) answer = 65536;
        else answer = 65536 * cross / total;

        return answer;
    }

    private void makeMap(Map<String, Integer> map, String str) {
        char[] array = str.toLowerCase().toCharArray();

        StringBuilder builder;
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");

        for (int i = 0; i < array.length - 1; i++) {
            builder = new StringBuilder();
            builder.append(array[i]).append(array[i + 1]);

            if (pattern.matcher(builder.toString()).find()) {
                map.put(builder.toString(),
                        map.get(builder.toString()) == null ? 1 : map.get(builder.toString()) + 1);
            }
        }
    }
}
