package springIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomerManager manager = new CustomerManager(new CustomerDalMysql());
		manager.add();
		System.out.println("veri tabaný deðiþtir");
		manager = new CustomerManager(new CustomerDalOracle());
		manager.add();
	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
