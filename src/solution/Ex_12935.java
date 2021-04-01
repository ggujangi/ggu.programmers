package solution;

/**
 * #12935
 * 제일 작은 수 제거하기
 */

public class Ex_12935 {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int minIndex = 0;

        if (length == 1) return new int[]{-1};
        int[] answer = new int[length - 1];

        for (int i = 0; i < length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        for (int i = minIndex + 1; i < length; i++) {
            arr[i - 1] = arr[i];
        }

        for (int i = 0; i < length - 1; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
