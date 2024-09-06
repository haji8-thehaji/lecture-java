package com.haji.model.people;

import com.haji.common.*;
import com.haji.model.People;/*  */
public class American extends People implements VisaCheck{
    String ssn;

    public American(String name, String gender, String nation, String ssn) {
        super(name, gender, nation);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name + "의 사회 보장번호 :" + ssn);
    }

    @Override
    public Integer VisaCheck() {
        if(!ssn.isEmpty())return 1;
        return 0;
    }
}   
