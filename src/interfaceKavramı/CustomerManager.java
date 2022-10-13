package interfaceKavramı;//İnterfaceler reference tiptir.

public class CustomerManager {
	private Customer _customer;
	private CreditManager _creditManager;

	public CustomerManager(Customer customer, CreditManager creditManager) {//buna poliformizm denir.
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}

	public void delete() {
		System.out.println("Müşteri silindi: ");
	}
	
	public void giveCredit() {
		_creditManager.calculate();//Önce hesapladım.
		System.out.println("Kredi verildi.");
	}

}
