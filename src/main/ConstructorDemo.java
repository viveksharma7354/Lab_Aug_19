package main;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

public class ConstructorDemo {
    private int number;
    private String name;

    public ConstructorDemo(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}