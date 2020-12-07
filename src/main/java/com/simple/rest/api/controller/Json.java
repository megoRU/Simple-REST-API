package com.simple.rest.api.controller;

public class Json {

    private String firstNumber;
    private String secondNumber;
    private String url;

    public Json(String firstNumber, String secondNumber, String url) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.url = url;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public String getUrl() {
        return url;
    }
}
