package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//depencency injection
		CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		manager.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
