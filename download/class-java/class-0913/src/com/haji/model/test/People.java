package com.haji.model.test;

import com.haji.model.Animal;

public class People extends Animal{
    public String nation;

    public People(String name, String gender, String nation) {
        super(name, gender);
        this.nation = nation;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        //System.out.println(name +"는 " + gender +"입니다.");
        System.out.println(name +"는 " + nation +"입니다.");
    }
    public void study(){
        System.out.println(name +"는 공부합니다.");
    }

    
}
