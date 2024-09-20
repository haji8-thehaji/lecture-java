package Strategy_Pattern.model.attack;

import Strategy_Pattern.model.common.ifAttackStrategy;

public class MissileStrategy implements ifAttackStrategy{
    public void attack(){
        System.out.println("미사일 공격");
    }
}
