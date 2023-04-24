package dependencyInjection;

public class ClientDI {

	private ServiceDI service;

	//Constructor DI
    public ClientDI(ServiceDI service) {
        this.service = service;
    }

    
    
    public void doSomething() {
        System.out.println("Doing something...");
        service.performOperation();
    }
}
