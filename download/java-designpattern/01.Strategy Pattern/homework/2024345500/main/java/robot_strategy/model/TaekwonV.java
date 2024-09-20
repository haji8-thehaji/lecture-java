package robot_strategy.model;

public class TaekwonV extends Robot {
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        if (super.getAttackStrategy() == null) {
            System.out.println(getName() + "가 태권도 공격을 합니다.");
        } else {
            super.attack();
        }
    }

    @Override
    public void move() {
        if (super.getMovingStrategy() == null) {
            System.out.println(getName() + "가 달려서 이동합니다.");
        } else {
            super.move();
        }
    }
}
