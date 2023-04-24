package decorator;

public class Pepperoni extends PizzaDecorator{
	
	public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
