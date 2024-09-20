package robot_strategy.strategy;

import robot_strategy.interfaces.MovingStrategy;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move(String name) {
        System.out.println(name + "이(가) 날아서 이동합니다.");
    }
}
