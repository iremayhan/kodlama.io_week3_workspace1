package interfaceKavramı;

public class TeacherCreditManager implements CreditManager {
	//Interfaceler reference tip olduğu için teacherCreditManagerın referansını tutabiliyor.


	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");
	}

	@Override
	public void save() {
		System.out.println("Öğretmen kredisi onaylandı.");
	}

}
