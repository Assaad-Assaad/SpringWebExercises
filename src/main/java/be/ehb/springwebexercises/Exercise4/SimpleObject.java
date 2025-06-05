package be.ehb.springwebexercises.Exercise4;

public class SimpleObject {

    private final String simpleString;
    private final int simpleInt;

    public SimpleObject(String simpleString, int simpleInt) {
        this.simpleString = simpleString;
        this.simpleInt = simpleInt;
    }

    public String getSimpleString() {
        return simpleString;
    }

    public int getSimpleInt() {
        return simpleInt;
    }
}
