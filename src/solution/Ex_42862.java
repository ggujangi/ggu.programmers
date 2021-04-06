package solution;

/**
 * #42862
 * 체육복
 */

public class Ex_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k == reserve[j] - 1 || k == reserve[j] + 1) {
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        return n - lost.length + count;
    }
}
