package solution.level_1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * #12969
 * url : https://programmers.co.kr/learn/courses/30/lessons/12969
 *
 * 직사각형 별찍기
 */

public class Ex_12969 {
    public void main() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }

            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
