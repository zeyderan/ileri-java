package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		//applicationContext.xml i�erisindeki ayarlar� ge�erli k�l
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//depencency injection
		//xml dosyas�nda bean olarak kaydedilen classlara buradan eri�ilir
		//database bean'a eri�, ICustomerDal.class s�n�f�n� implemente eder
		CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		manager.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
