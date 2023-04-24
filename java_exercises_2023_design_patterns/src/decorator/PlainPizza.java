package decorator;

public class PlainPizza implements Pizza{

    public String getDescription() {
        return "Plain pizza";
    }

    public double getCost() {
        return 5.0;
    }
}
