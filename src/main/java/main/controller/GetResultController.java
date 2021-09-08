package main.controller;

import main.api.response.ResultResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GetResultController {

    private final Random random = new Random();

    @GetMapping(value = "games/dice", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<ResultResponse> list() {
        int first = random.nextInt(6) + 1;
        int second = random.nextInt(6) + 1;

        return new ResponseEntity<>(new ResultResponse(first,
                second,
                choiceOfSides(first, second)), HttpStatus.OK);
    }

    private String choiceOfSides(int first, int second) {
        return "https://megoru.ru/disImages/" + first + "-" + second + ".png";
    }
}