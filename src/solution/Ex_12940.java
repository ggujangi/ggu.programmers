package solution;

/**
 * #12940
 * 최대공약수와 최소공배수
 */

public class Ex_12940 {
    public int[] solution(int n, int m) {
        int temp = 1;
        int originM = m, originN = n;

        while (temp!=0){
            temp = m % n;
            m = n;
            n = temp;
        }

        return new int[]{m, (originM/m) * (originN/m) * m};
    }
}
