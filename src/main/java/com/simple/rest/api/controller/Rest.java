package com.simple.rest.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "games/dice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class Rest {

  private final Random random = new Random();
  private Integer first = null;
  private Integer second = null;

  @GetMapping
  private Json list() {
    return new Json(first = random.nextInt(6) + 1,
        second = random.nextInt(6) + 1,
        choiceOfSides());
  }

  private String choiceOfSides() {
    return "https://megoru.ru/disImages/" + first + "-" + second + ".png";
  }
}