package com.kyocoolcool.mastermicroservices.helloworld;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/3 3:32 PM
 */
public class HelloWorldBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
