package referenceTypeAndValueType;

public class Main {

	public static void main(String[] args) {
		// Referans tip ve değer tip farkı: (mülakatlarda vs çok soruluyor.)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2; //sayi1'in değeri eşittir sayi2'nin değeri.
		sayi2 = 100;
		System.out.println(sayi1);//o halde 20.
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar1 = sayilar2;//sayilar1'in referans numarası eşittir sayilar2'nin referans numarası.
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);//o halde 1000.
		
	}

}
