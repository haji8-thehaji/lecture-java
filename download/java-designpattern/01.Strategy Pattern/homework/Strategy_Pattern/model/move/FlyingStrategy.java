package Strategy_Pattern.model.move;

import Strategy_Pattern.model.comon.ifMovingStrategy;

public class FlyingStrategy implements ifMovingStrategy{
    public void move(){
        System.out.println("공중부양");
    }
}
