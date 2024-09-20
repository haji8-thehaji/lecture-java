package robot_strategy.model;

import robot_strategy.interfaces.AttackStrategy;
import robot_strategy.interfaces.MovingStrategy;

public class Robot {
    private final String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public MovingStrategy getMovingStrategy() {
        return movingStrategy;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void move() {
        if (movingStrategy != null) {
            movingStrategy.move(name);
        } else {
            System.out.println("이동 전략이 설정되지 않았습니다.");
        }
    }

    public void attack() {
        if (attackStrategy != null) {
            attackStrategy.attack(name);
        } else {
            System.out.println("공격 전략이 설정되지 않았습니다.");
        }
    }
}
