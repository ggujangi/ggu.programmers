package solution.level_2;

/**
 * #49993
 * url : https://programmers.co.kr/learn/courses/30/lessons/49993
 *
 * 스킬트리
 */
public class Ex_49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        char[] skills = skill.toCharArray();

        for (String skill_tree : skill_trees) {
            int lastIndex = Integer.MIN_VALUE;
            for (char c : skills) {
                int index = skill_tree.indexOf(c);

                if ((lastIndex == -1 && index > lastIndex) || (index != -1 && lastIndex > index)) {
                    answer--;
                    break;
                }

                lastIndex = index;
            }
        }

        return answer;
    }
}
