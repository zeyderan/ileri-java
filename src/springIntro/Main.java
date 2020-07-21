package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		//applicationContext.xml içerisindeki ayarlarý geçerli kýl
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//depencency injection
		//xml dosyasýnda bean olarak kaydedilen classlara buradan eriþilir
		//database bean'a eriþ, ICustomerDal.class sýnýfýný implemente eder
		CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		manager.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
