package com.haji.model;

public class animal {
    public int age;
    public String gender;

    animal(int age, String gender){
        this.age =age;
        this.gender = gender;
    }

    public void isMamal(){
        System.out.println("포유류입니다.");
    }
    public void introduce(String setText){
        System.out.println("hello " + setText );
    }
}
