package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #42840
 * url : https://programmers.co.kr/learn/courses/30/lessons/42840
 *
 * 모의고사
 */

public class Ex_42840 {
    public int[] solution(int[] answers) {
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Person[] array = new Person[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Person(i + 1, 0);
        }

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) array[0].count++;
            if (answers[i] == two[i % 8]) array[1].count++;
            if (answers[i] == three[i % 10]) array[2].count++;
        }

        int max = Math.max(array[0].count, Math.max(array[1].count, array[2].count));

        List<Integer> list = new ArrayList<>();
        for (Person p : array) {
            if (p.count == max) list.add(p.id);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result);

        return result;

    }

    private class Person {
        int id;
        int count;

        public Person(int id, int count) {
            this.id = id;
            this.count = count;
        }
    }
}
