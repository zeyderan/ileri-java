package springIntro;

//mysql i�in crud i�lemleri
public class CustomerDalMysql implements ICustomerDal {

	//virtual add
	public void add() {
		System.out.println("Mysql veri taban�na eklendi");
	}
}
