package solution;

/**
 * #12944
 * 평균 구하기
 */

public class Ex_12944 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }
}
