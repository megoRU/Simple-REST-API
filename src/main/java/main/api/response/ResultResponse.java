package main.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultResponse {

    private final Integer firstNumber;
    private final Integer secondNumber;
    private final String url;
}
