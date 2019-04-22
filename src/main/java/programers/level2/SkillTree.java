package programers.level2;

import java.util.HashMap;
import java.util.Map;

public class SkillTree {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String skill = "CBD";
        String[] skillTree = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution2.solution(skill, skillTree));
    }
}

class Solution2{
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            int tmp = 0;
            boolean boo = true;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                for (int k = 0; k < skill.length(); k++) {
                    if (skill.charAt(k) == skill_trees[i].charAt(j)) {
                        if (k != tmp) {
                            boo = false;
                        } else {
                            tmp++;
                        }
                    }
                }
            }
            if (boo) {
                answer++;
            }
        }

        return answer;
    }
}