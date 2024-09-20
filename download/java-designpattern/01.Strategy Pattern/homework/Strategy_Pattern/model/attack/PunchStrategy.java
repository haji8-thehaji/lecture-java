package Strategy_Pattern.model.attack;

import Strategy_Pattern.model.comon.ifAttackStrategy;

public class PunchStrategy implements ifAttackStrategy{
    public void attack(){
        System.out.println("팔콘펀치");
    }
}
