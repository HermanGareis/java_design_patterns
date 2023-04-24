package decorator;

public class Cheese extends PizzaDecorator{
	
	public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }

}
