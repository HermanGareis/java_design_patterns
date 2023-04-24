package proxy;

public class ServiceProxy implements ServiceP{
	private ServiceP service;

    public ServiceProxy() {
        // This could be a costly operation, like creating a network connection
        service = new ServiceImplementation();
    }

    public void doSomething() {
        // Instead of invoking the service directly, we use the proxy to interact with it
        System.out.println("Proxy is doing something...");
        service.doSomething();
    }

}
