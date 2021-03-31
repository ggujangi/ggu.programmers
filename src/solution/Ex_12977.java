package solution;

/**
 * #12977
 * 소수 만들기
 */

public class Ex_12977 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    if (isAnswer(n)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isAnswer(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
