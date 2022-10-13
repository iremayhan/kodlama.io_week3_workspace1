package classes;

public class CustomerManager {
	private Customer _customer;
	private Person _person;
	private Company _company;

	public CustomerManager(Customer customer, Person person, Company company) {
		_customer = customer;
		_person = person;
		_company = company;
		// customer a ulaşabilmek için private nesneyi oluşturduk.
		// Class içerisinde başka operasyonda da _customerı rahatlıkla kullanabileceğim.
	}

	public void save() {
		// encapsulation budur. Save'in içerisine parametre atadık.
		System.out.println("Müşteri kaydedildi: " + _person.firstName);
	}

	public void delete() {
		System.out.println("Müşteri silindi : " + _person.firstName);
	}

	public void saveCompany() {
		System.out.println("Şirket kaydedildi: " + _company.companyName);
	}
}
