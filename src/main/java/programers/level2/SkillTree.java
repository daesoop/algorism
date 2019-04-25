package programers.level2;

import java.util.HashMap;
import java.util.Map;

public class SkillTree {
    public static void main(String[] args) {
        Solution3 solution2 = new Solution3();
        String skill = "CBD";
        String[] skillTree = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution2.solution(skill, skillTree));
    }
}

class Solution2 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            boolean boo = true;
            int tmp = 0;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                for (int k = 0; k < skill.length(); k++) {
                    if (skill_trees[i].charAt(j) == skill.charAt(k)) {
                        if (k != tmp) {
                            boo = false;
                            break;
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

class Solution3{
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            boolean bo = true;
            int tmp = 0;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.charAt(tmp) != skill_trees[i].charAt(j)) {
                    bo = false;
                } else if (skill.charAt(tmp) == skill_trees[i].charAt(j)) {
                    System.out.println(tmp);
                    tmp++;

                }
            }
            if (bo) {
                answer++;
            }
        }
        return answer;
    }
}