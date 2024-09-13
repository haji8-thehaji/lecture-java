package com.haji.model;

public class Horse extends Animal{
    public int maxSpeed;

    public Horse(String name, String gender, int maxSpeed) {
        super(name, gender);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        //System.out.println(name +"는 " + gender +"입니다.");
        System.out.println(name +"의 최고속력은" + maxSpeed +"km/h 입니다.");
    }
    public void yell(){
        System.out.println(name + "이 외칩니다. whinny");
    }
    
}