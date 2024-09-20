package robot_strategy.strategy;

import robot_strategy.interfaces.AttackStrategy;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + "이(가) 미사일 공격을 합니다.");
    }
}
