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
    private String first = null;
    private String second = null;

    @GetMapping
    private Json list() {
        random();
        return new Json(first, second, choiceOfSides());
    }

    private void random() {
       first = String.valueOf(random.nextInt(6) + 1);
       second = String.valueOf(random.nextInt(6) + 1);
    }

    private String choiceOfSides() {

        //1
        if (first.equals("1")) {

            if (second.equals("1")) {
                return "https://megolox.ru/disImages/1-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/1-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/1-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/1-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/1-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/1-6.png";
            }
        }

        //2

        if (first.equals("2")) {

            if (second.equals("1")) {
                return "https://megolox.ru/disImages/2-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/2-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/2-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/2-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/2-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/2-6.png";
            }
        }

        //3
        if (first.equals("3")) {


            if (second.equals("1")) {
                return "https://megolox.ru/disImages/3-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/3-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/3-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/3-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/3-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/3-6.png";
            }
        }

        //4
        if (first.equals("4")) {

            if (second.equals("1")) {
                return "https://megolox.ru/disImages/4-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/4-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/4-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/4-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/4-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/4-6.png";
            }
        }

        //
        if (first.equals("5")) {

            if (second.equals("1")) {
                return "https://megolox.ru/disImages/5-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/5-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/5-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/5-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/5-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/5-6.png";
            }
        }

        //
        if (first.equals("6")) {

            if (second.equals("1")) {
                return "https://megolox.ru/disImages/6-1.png";
            }

            if (second.equals("2")) {
                return "https://megolox.ru/disImages/6-2.png";
            }

            if (second.equals("3")) {
                return "https://megolox.ru/disImages/6-3.png";
            }

            if (second.equals("4")) {
                return "https://megolox.ru/disImages/6-4.png";
            }

            if (second.equals("5")) {
                return "https://megolox.ru/disImages/6-5.png";
            }

            if (second.equals("6")) {
                return "https://megolox.ru/disImages/6-6.png";
            }
        }

        return "https://megolox.ru/dice.png";
    }
}
