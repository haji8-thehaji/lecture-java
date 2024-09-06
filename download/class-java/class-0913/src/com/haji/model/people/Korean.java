package com.haji.model.people;

import com.haji.common.*;
import com.haji.model.People;

public class Korean extends People implements VisaCheck {
    public String residentNumber;

    public Korean(String residentNumber, String name, String gender, String nation) {
        super(name, gender, nation);
        this.residentNumber = residentNumber;
    }

    @Override
    public Integer VisaCheck() {
        if( residentNumber.length() == 13)return 1;
        return 0;
    }
}
