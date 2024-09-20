package com.haji.model;

public class fish extends animal {

    public int sizeFt;

    fish(int age, String gender, int sizeFt) {
        super(age, gender);
        this.sizeFt = sizeFt;
    }
    public void swim(){
        System.out.println("물고기가 헤엄칩니다.");
    }

    
    @Override
    public void isMamal(){
        System.out.println("포유류가 아닙니다.");
    }
}
