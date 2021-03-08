package com.kyocoolcool.mastermicroservices.person;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/6 7:16 PM
 */
public class PersonV1 {
    private String name;

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
