package java_exercises_2023_design_patterns;

import decorator.Cheese;
import decorator.Pepperoni;
import decorator.Pizza;
import decorator.PlainPizza;
import dependencyInjection.ClientDI;
import dependencyInjection.ServiceDI;
import dependencyInjection.ServiceImplementation;
import facade.Facade;
import factory.CircleFactory;
import factory.RectangleFactory;
import factory.Shape;
import factory.ShapeFactory;
import proxy.ServiceP;
import proxy.ServiceProxy;
import singleton.Singleton;

public class Main {

	public static void main(String[] args) {

		// Facade Client
		System.out.println("Facade: ");
		Facade facade = new Facade();
		facade.operation();

		System.out.println();

		// Proxy Client
		System.out.println("Proxy: ");
		ServiceP serviceProxy = new ServiceProxy();
		serviceProxy.doSomething();

		System.out.println();

		// Decorator Client
		System.out.println("Decorator: ");
		Pizza pizza = new Cheese(new Pepperoni(new PlainPizza()));
		System.out.println("Pizza description: " + pizza.getDescription());
		System.out.println("Pizza cost: " + pizza.getCost());

		System.out.println();

		// Factory Client
		System.out.println("Factory: ");
		ShapeFactory factory = new CircleFactory();
		Shape shape = factory.createShape();
		shape.draw();

		factory = new RectangleFactory();
		shape = factory.createShape();
		shape.draw();

		System.out.println();

		// Singleton
		System.out.println("Singleton:");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		if (instance1 == instance2) {
			System.out.println("They are the same instance");
		}

		System.out.println();

		// Dependency Injection
		System.out.println("Dependency Injection: ");
		ServiceDI service = new ServiceImplementation();
		ClientDI client = new ClientDI(service);
		client.doSomething();

	}

}
