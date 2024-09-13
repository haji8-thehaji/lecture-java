package com.haji;
import com.haji.model.*;
import com.haji.model.test.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal a1 = new Animal("동물", "중성");
        a1.eat("바나나");
        a1.run();
        a1.printInfo();

        Car c1 = new Car(100);
        c1.drive();
        c1.printInfo();
        
    }
}