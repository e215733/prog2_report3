package jp.ac.uryukyu.ie.e215733;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    
    @Test
    void attachWithWeponSkillTest() {
        int defaultEnemyHP = 300;
        Warrior warrior = new Warrior("戦士", 100, 20);
        Enemy enemy = new Enemy("スライム", defaultEnemyHP, 20);
        int weponSkillDamage = (int)(warrior.attack * 1.5);
        int enemyDamage = 0;

        for(int i=0; i<5; i++){
            warrior.attackWithWeponSkill(enemy);
            enemyDamage = defaultEnemyHP - enemy.hitPoint;
            assertEquals(weponSkillDamage, enemyDamage);
            defaultEnemyHP -= enemyDamage;
        }
    }
}