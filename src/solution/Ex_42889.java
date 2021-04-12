package solution;

import java.util.Arrays;

/**
 * #42889
 * 실패율
 */

public class Ex_42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int count, total = stages.length;

        Stage[] s = new Stage[N];

        for (int i = 1; i <= answer.length; i++) {
            count = 0;
            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }
            }
            s[i - 1] = new Stage(i, (float) count / (float) total);
            total = total - count;
        }

        Arrays.sort(s, (o1, o2) -> {
            if (o1.result < o2.result) return 1;
            else if (o1.result > o2.result) return -1;
            else {
                if (o1.id < o2.id) return -1;
            }
            return 0;
        });

        for (int i = 0; i < s.length; i++) {
            answer[i] = s[i].id;
        }
        return answer;
    }

    class Stage {
        int id;
        float result;

        public Stage(int id, float result) {
            this.id = id;
            this.result = result;
        }
    }
}
