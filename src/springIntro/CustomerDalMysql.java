package springIntro;

//mysql için crud iþlemleri
public class CustomerDalMysql implements ICustomerDal {

	//virtual add
	public void add() {
		System.out.println("Mysql veri tabanýna eklendi");
	}
}
