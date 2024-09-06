package com.haji.model;

import com.haji.common.*;

public class Animal implements Info {
    public String name;
    public String gender;
    
    public Animal(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void printInfo(){
        System.out.println(name +"는 " + gender +"입니다.");
    }
    public void run(){
        System.out.println(name +"이 달립니다.");
    }
    public void eat(String something){
        System.out.println(name +"이 " +something +"을 먹습니다.");
    }
}
