package be.ehb.springwebexercises.Exercise1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LuckyNumberController {

    @GetMapping("/lucky")
    public int getLuckyNumber() {
        int luckyNumber = (int) (Math.random() * 10);
        return luckyNumber;
    }
}
