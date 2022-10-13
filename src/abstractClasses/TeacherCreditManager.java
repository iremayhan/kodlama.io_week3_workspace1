package abstractClasses;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");

	}

	public void save() {
		System.out.println("Öğretmene kredi.");

	}

}
