package com.haji.model.test;
import com.haji.common.*;

public class Car implements Info{
    public int maxSpeed = 0;

    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
    
        System.out.println("자동차의 최고속력은" + maxSpeed +"km/h 입니다.");
     }

     public void drive(){
         System.out.println("자동차가 달립니다.");
     }
    
}
