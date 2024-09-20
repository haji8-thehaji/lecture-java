package robot_strategy.strategy;

import robot_strategy.interfaces.MovingStrategy;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move(String name) {
        System.out.println(name + "이(가) 걷습니다.");
    }
}
