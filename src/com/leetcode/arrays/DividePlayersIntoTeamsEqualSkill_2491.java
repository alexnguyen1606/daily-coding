package com.leetcode.arrays;

import java.util.Arrays;

public class DividePlayersIntoTeamsEqualSkill_2491 {

    public long dividePlayers(int[] skill) {
        int totalMember = skill.length;
        int totalSkill = totalSkill(skill);
        int numberMember = 2;
        int totalTeam = totalMember / numberMember;
        int totalSkillEachTeam = totalSkill / totalTeam;
        long chemistry = 0;

        for (int i = 0; i < skill.length; i++) {
            int iSkill = skill[i];
            if (iSkill == 0) {
                continue;
            }
            int[] team = new int[numberMember];
            team[0] = iSkill;
            skill[i] = 0;
            for (int j = i + 1; j < skill.length; j++) {
                if (skill[j] == 0) {
                    continue;
                }
                if (totalSkillEachTeam - iSkill == skill[j]) {
                    team[1] = skill[j];
                    skill[j] = 0;
                    break;
                }
            }
            if (team[1] == 0) {
                return -1;
            }
            chemistry = chemistry + (long) team[0] * team[1];

        }
        return chemistry;
    }

    private int totalSkill(int[] skill) {
        int totalSkill = 0;
        for (int skillPerMember : skill) {
            totalSkill += skillPerMember;
        }
        return totalSkill;
    }

    //Use two pointer
    //skill.length always even
    //Vì tổng skill mỗi team cần bằng
    //Sắp xếp skill có nghĩ thành viên 2 đầu tương ứng của array cần có tổng bằng skillTarget mỗi team
    public long dividePlayersV2(int[] skill) {
        int totalSkill = totalSkill(skill);
        int totalTeam = skill.length / 2;
        int skillTarget = totalSkill / totalTeam;
        long chemistry = 0;
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        while(i < j) {
            if((skill[i] + skill[j]) != skillTarget) {
                return -1;
            }
            chemistry = chemistry + (long) skill[i] * skill[j];
            i++;
            j--;
        }

        return chemistry;
    }

    public static void main(String[] args) {
        int[] skill = new int[]{3, 2, 5, 1, 3, 4};
        DividePlayersIntoTeamsEqualSkill_2491 divide = new DividePlayersIntoTeamsEqualSkill_2491();
        System.out.println(divide.dividePlayers(skill));
    }

}
