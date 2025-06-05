package be.ehb.springwebexercises.Exercise5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exceptions")
public class ExceptionController {

    private final ExceptionService exceptionService;

    @Autowired
    public ExceptionController(ExceptionService exceptionService) {
        this.exceptionService = exceptionService;
    }

   @GetMapping("/nullpointer")
    public void nullPointer() {
        exceptionService.nullPointer();
    }

    @GetMapping("/indexoutofbound")
    public void indexOutOfBound() {
        exceptionService.indexOutOfBound();
    }

    @GetMapping("/inputmismatch")
    public void inputMismatch() {
        exceptionService.inputMismatch();
    }

    @GetMapping("/illegalargument")
    public void illegalArgument() {
        exceptionService.illegalArgument();
    }


}
