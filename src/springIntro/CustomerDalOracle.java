package springIntro;

//oracle veritaban� i�i crud i�lemleri
public class CustomerDalOracle implements ICustomerDal {
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public void add() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("orale veri taban�na eklendi");
	}
}
