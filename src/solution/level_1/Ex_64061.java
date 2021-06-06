package solution.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * #64061
 * url : https://programmers.co.kr/learn/courses/30/lessons/64061
 *
 * 크레인 인형뽑기 게임
 */

public class Ex_64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board.length;
        List<Integer> result = new ArrayList<>();

        for (int move : moves) {
            int index = move - 1;

            for (int j = 0; j < size; j++) {
                if (board[j][index] != 0) {
                    if (result.size() > 0 && result.get(result.size() - 1) == board[j][index]) {
                        result.remove(result.size() - 1);
                        answer += 2;
                    } else {
                        result.add(board[j][index]);
                    }

                    board[j][index] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
