package challenge.weekly;

/**
 * #83201
 * url : https://programmers.co.kr/learn/courses/30/lessons/83201
 *
 * 상호 평가
 */

public class Ex_83201 {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < scores[0].length; i++) {
            float sum = 0;
            int count = scores.length;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int myScore = scores[i][i];
            boolean isSame = false;
            for (int j = 0; j < scores.length; j++) {
                if (i != j) {
                    if (myScore == scores[j][i]) isSame = !isSame;
                    min = Math.min(min, scores[j][i]);
                    max = Math.max(max, scores[j][i]);
                }
                sum += scores[j][i];
            }

            float result;
            if (myScore >= min && myScore <= max || isSame) {
                result = sum / count;
            } else {
                result = (sum - myScore) / (count - 1);
            }

            answer.append(convert(result));
        }

        return answer.toString();
    }

    private String convert(float result) {
        if (result >= 90) return "A";
        else if (result >= 80) return "B";
        else if (result >= 70) return "C";
        else if (result >= 50) return "D";
        else return "F";
    }
}
