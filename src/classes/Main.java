package classes;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager(); // newleyerek heap'te referans oluşturmuş oluyoruz.
		creditManager.calculate();// bu yöntem ile istediğim zaman istediğim yerde operasyonu çağırabilirim.
		creditManager.save();

		Customer customer = new Customer(); // örneğini oluşturmak, instance oluşturmak, instance creation.
		customer.id = 1;
		customer.city = "Niğde";
		
		Company company = new Company();
		company.taxNumber="100000";
		company.companyName="Ayhanlar Turizm";
		company.id=100;
		company.city="Niğde";
		
		Person person = new Person();
		person.nationalIdentity="123456";
		person.firstName="İrem";
		person.lastName="Ayhan";
		
		//CustomerManager customerManager2 = new CustomerManager(new Company(), new Person());
		
		
		CustomerManager customerManager = new CustomerManager(customer, person, company);
		customerManager.save();
		customerManager.delete();
		customerManager.saveCompany();
		
		
		
		
	}

}
