package be.ehb.springwebexercises.Exercise5;

import org.springframework.stereotype.Component;

import java.util.InputMismatchException;

@Component
class ExceptionService {
    void nullPointer() {
        throw new NullPointerException();
    }
    void indexOutOfBound() {
        throw new IndexOutOfBoundsException();
    }
    void inputMismatch() {
        throw new InputMismatchException();
    }
    void illegalArgument() {
        throw new IllegalArgumentException();
    }
}
