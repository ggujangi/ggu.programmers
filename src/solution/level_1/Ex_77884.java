package solution.level_1;

/**
 * #77884
 * url : https://programmers.co.kr/learn/courses/30/lessons/77884
 *
 * 약수의 개수와 덧셈
 */

public class Ex_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) count++;
            }
            answer += (i * ((count % 2 == 0) ? 1 : (-1)));
        }
        return answer;
    }
}
