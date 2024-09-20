package robot_strategy.model;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        if (super.getAttackStrategy() == null) {
            System.out.println(getName() + "이 레이저 공격을 합니다.");
        } else {
            super.attack();
        }
    }

    @Override
    public void move() {
        if (super.getMovingStrategy() == null) {
            System.out.println(getName() + "이 빠르게 날아갑니다.");
        } else {
            super.move();
        }
    }
}
