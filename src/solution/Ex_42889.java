package solution;

/**
 * #42889
 * 실패율
 */

public class Ex_42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] f = new float[N];
        int count, total = stages.length;

        for (int i = 1; i <= f.length; i++) {
            count = 0;
            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }
            }
            f[i - 1] = (float) count / (float) total;
            answer[i - 1] = i;
            total = total - count;
        }

        for (int i = 0; i < f.length; i++) {
            float temp;
            int tempIndex;
            for (int j = 0; j < f.length; j++) {
                if (f[i] > f[j]) {
                    temp = f[j];
                    f[j] = f[i];
                    f[i] = temp;
                    tempIndex = answer[j];
                    answer[j] = answer[i];
                    answer[i] = tempIndex;
                } else if (f[i] == f[j]) {
                    if (answer[i] < answer[j]) {
                        tempIndex = answer[j];
                        answer[j] = answer[i];
                        answer[i] = tempIndex;
                    }
                }
            }
        }

        return answer;
    }
}
