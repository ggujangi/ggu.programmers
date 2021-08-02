package challenge.weekly;

/**
 * #82612
 * url : https://programmers.co.kr/learn/courses/30/lessons/82612
 *
 * 부족한 금액 계산하기
 */

public class Ex_82612 {

    public long solution(int price, int money, int count) {
        long sum = 0;

        while (count != 0) {
            sum += price * count;
            count--;
        }

        long result = sum - money;

        return result >= 0 ? 0 : result;
    }
}
