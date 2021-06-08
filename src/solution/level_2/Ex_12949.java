package solution.level_2;

/**
 * #12949
 * url : https://programmers.co.kr/learn/courses/30/lessons/12949
 *
 * 행렬의 곱셈
 */

public class Ex_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {  // arr1 아래로
            for (int j = 0; j < arr2[0].length; j++) { // arr2 옆으로
                for (int k = 0; k < arr2.length; k++) { // arr2 아래로
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return answer;
    }
}
