package robot_strategy;

import robot_strategy.model.Atom;
import robot_strategy.model.Sungard;
import robot_strategy.model.TaekwonV;
import robot_strategy.strategy.FlyingStrategy;
import robot_strategy.strategy.MissileStrategy;
import robot_strategy.strategy.PunchStrategy;
import robot_strategy.strategy.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        Atom a1 = new Atom("아톰");
        System.out.println(a1.getName() + "의 고유 행동:");
        a1.move();
        a1.attack();
        a1.setMovingStrategy(new FlyingStrategy());
        a1.setAttackStrategy(new MissileStrategy());
        System.out.println(a1.getName() + "의 전략 행동:");
        a1.move();
        a1.attack();

        TaekwonV t1 = new TaekwonV("태권브이");
        System.out.println(t1.getName() + "의 고유 행동:");
        t1.move();
        t1.attack();
        t1.setMovingStrategy(new WalkingStrategy());
        t1.setAttackStrategy(new PunchStrategy());
        System.out.println(t1.getName() + "의 전략 행동:");
        t1.move();
        t1.attack();

        Sungard s1 = new Sungard("선가드");
        System.out.println(s1.getName() + "의 고유 행동:");
        s1.move();
        s1.attack();
        s1.setMovingStrategy(new WalkingStrategy());
        s1.setAttackStrategy(new PunchStrategy());
        System.out.println(s1.getName() + "의 전략 행동:");
        s1.move();
        s1.attack();
    }
}
