package solution;

/**
 * #12930
 * 이상한 문자 만들기
 */

public class Ex_12930 {
    public String solution(String s) {
        String[] array = s.split(" ", -1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(convertWord(array[i]));
            if (i < array.length - 1) builder.append(" ");
        }
        return builder.toString();
    }

    private String convertWord(String str) {
        String[] array = str.split("", -1);
        System.out.println(array.length);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append((i % 2 == 0) ? array[i].toUpperCase() : array[i].toLowerCase());
        }
        return builder.toString();
    }
}
