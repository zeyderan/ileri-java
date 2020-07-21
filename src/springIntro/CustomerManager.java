package springIntro;

public class CustomerManager {
	ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}
	

	public void add() {
		customerDal.add();
	}
}