package interfaceKavramı;

public class MilitaryCreditManager implements CreditManager{
	//Interfaceler reference tip olduğu için militaryCreditManagerın referansını tutabiliyor.

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı.");
	}

	@Override
	public void save() {
		System.out.println("Asker kredisi onaylandı.");
	}

}
