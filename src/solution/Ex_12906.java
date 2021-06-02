package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * #12906
 * url : https://programmers.co.kr/learn/courses/30/lessons/12906
 *
 * 같은 숫자는 싫어
 * 효율성 테스트 : 27ms
 */

public class Ex_12906 {
    public int[] solution(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();

        int lastNum = -1;

        for(int i : arr){
            if(lastNum != i) arrayList.add(i);
            lastNum = i;
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
