package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ClassPathXmlApplicationContext context;
	private static ICustomerService customerService;

	public static void main(String[] args) {
		//applicationContext.xml i�erisindeki ayarlar� ge�erli k�l
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		customerService = context.getBean("service", ICustomerService.class);
		
		customerService.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
