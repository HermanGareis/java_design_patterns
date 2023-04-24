package facade;

public class Facade {

	private SubSystemA subSystemA;
	private SubSystemB subSystemB;
	private SubSystemC subSystemC;

	public Facade() {
		subSystemA = new SubSystemA();
		subSystemB = new SubSystemB();
		subSystemC = new SubSystemC();
	}

	public void operation() {
		subSystemA.operationA();
		subSystemB.operationB();
		subSystemC.operationC();
	}

}
