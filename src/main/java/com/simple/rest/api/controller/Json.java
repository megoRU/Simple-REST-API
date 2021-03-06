package com.simple.rest.api.controller;

public class Json {

  private final Integer firstNumber;
  private final Integer secondNumber;
  private final String url;

  public Json(Integer firstNumber, Integer secondNumber, String url) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.url = url;
  }

  public Integer getFirstNumber() {
    return firstNumber;
  }

  public Integer getSecondNumber() {
    return secondNumber;
  }

  public String getUrl() {
    return url;
  }
}
