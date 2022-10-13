package abstractClasses;

public class CarCredditManager extends BaseCreditManager implements CreditManager
{

	@Override
	public void calculate() {
		System.out.println("Araç kredisi hesaplandı.");
		
	}

}
