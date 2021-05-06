package TransitiontoJava;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer("Can", "Temiz", 73, "25986481256", "20:45:32")); // iki m��terinin de
		baseCustomerManager.complete(); // save() i ayn�
										// oldu�u i�in ikisi
										// i�inde db ye
										// kay� etme i��lemi
										// ayn� �ekilde
										// ger�ekle�tirilir

		BaseCustomerManager baseCustomerManager3 = new GaladiaCustomManager(new MernisServiceAdaptor());
		baseCustomerManager3.save2(new Alien("Brupbrup", 562, 1700));
		baseCustomerManager3.complete();
		// Console.readLine(); // hocam C# olsayd� ki de�il, ki ama� bu, dilleri
		// ��renmek de�il dili ��renmek ve bunu adapte etmek,k�sacas� �devin anlam�n�
		// anlay�p bir de oldu�u kadar uygulamam �devin amac�na ula�t���n� bildirmem
		// umar�m sizi mutlu eder, iyi g�nler hocam

	}

}
