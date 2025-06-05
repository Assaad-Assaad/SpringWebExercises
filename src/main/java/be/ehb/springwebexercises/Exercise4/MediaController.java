package be.ehb.springwebexercises.Exercise4;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
public class MediaController {


    @GetMapping(path = "/produce", produces = "application/json")
    public SimpleObject getSimpleObject() {
        return new SimpleObject("Simple String", 123);
    }

    @PostMapping(path = "/consume", consumes = "application/json")
    public String consumeSimpleObject(@RequestBody SimpleObject simpleObject) {
        return simpleObject.getSimpleString() + " " + simpleObject.getSimpleInt();
    }

}

