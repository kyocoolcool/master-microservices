package com.kyocoolcool.mastermicroservices.person;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/6 7:16 PM
 */
public class PersonV2 {
    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
