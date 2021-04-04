package solution;

/**
 * #12901
 * 2016년
 */

public class Ex_12901 {
    public String solution(int a, int b) {
        int day = b;

        for (int i = 1; i < a; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> day += 31;
                case 4, 6, 9, 11 -> day += 30;
                case 2 -> day += 29;
            }
        }

        return switch ((day - 1) % 7) {
            case 1 -> "SAT";
            case 2 -> "SUN";
            case 3 -> "MON";
            case 4 -> "TUE";
            case 5 -> "WED";
            case 6 -> "THU";
            default -> "FRI";
        };
    }
}
