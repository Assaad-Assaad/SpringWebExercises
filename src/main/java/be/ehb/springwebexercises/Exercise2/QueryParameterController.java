package be.ehb.springwebexercises.Exercise2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QueryParameterController {

    @GetMapping("/power")
    public int getPower(@RequestParam int number) {
        int power = number * number;
        return power;

    }
}
