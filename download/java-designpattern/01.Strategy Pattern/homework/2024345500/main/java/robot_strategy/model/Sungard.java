package robot_strategy.model;

public class Sungard extends Robot {
    public Sungard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        if (super.getAttackStrategy() == null) {
            System.out.println(getName() + "가 검으로 공격합니다.");
        } else {
            super.attack();
        }
    }

    @Override
    public void move() {
        if (super.getMovingStrategy() == null) {
            System.out.println(getName() + "가 빠르게 이동합니다.");
        } else {
            super.move(); 
        }
    }
}
