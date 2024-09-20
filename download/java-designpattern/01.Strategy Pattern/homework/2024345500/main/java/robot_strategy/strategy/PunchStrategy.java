package robot_strategy.strategy;

import robot_strategy.interfaces.AttackStrategy;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack(String name) {
        System.out.println(name + "이(가) 펀치 공격을 합니다.");
    }
}
