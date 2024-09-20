package com.haji.model;

public class duck extends animal{
    String beakColor = "yellow";

    duck(int age, String gender, String beakColor){
        super(age, gender);
        this.beakColor = beakColor;
    }
    duck(int age, String gender){
        super(age, gender);
    }
    public void swim(){
        System.out.println("헤엄칩니다");
    }
    public void quak(){
        System.out.println("오리 꽥꽥");
    }
    @Override
    public void introduce()
    {
        super.introduce("오리");
    }
    @Override
    public void isMamal(){
        System.out.println("포유류입니다.");
    }

}
