package com.simple.rest.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Rest {

  private final Random random = new Random();

  @GetMapping(value = "games/dice", produces = MediaType.APPLICATION_JSON_VALUE)
  private Json list() {
    int first;
    int second;
    return new Json(first = random.nextInt(6) + 1,
        second = random.nextInt(6) + 1,
        choiceOfSides(first, second));
  }

  private String choiceOfSides(int first, int second) {
    return "https://megoru.ru/disImages/" + first + "-" + second + ".png";
  }
}