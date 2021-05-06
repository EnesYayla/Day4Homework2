package TransitiontoJava;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer("Can", "Temiz", 73, "25986481256", "20:45:32")); // iki müþterinin de
		baseCustomerManager.complete(); // save() i ayný
										// olduðu için ikisi
										// içinde db ye
										// kayý etme iþþlemi
										// ayný þekilde
										// gerçekleþtirilir

		BaseCustomerManager baseCustomerManager3 = new GaladiaCustomManager(new MernisServiceAdaptor());
		baseCustomerManager3.save2(new Alien("Brupbrup", 562, 1700));
		baseCustomerManager3.complete();
		// Console.readLine(); // hocam C# olsaydý ki deðil, ki amaç bu, dilleri
		// öðrenmek deðil dili öðrenmek ve bunu adapte etmek,kýsacasý ödevin anlamýný
		// anlayýp bir de olduðu kadar uygulamam ödevin amacýna ulaþtýðýný bildirmem
		// umarým sizi mutlu eder, iyi günler hocam

	}

}
