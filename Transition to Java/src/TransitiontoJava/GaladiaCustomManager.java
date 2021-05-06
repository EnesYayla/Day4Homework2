package TransitiontoJava; // Imaginary Location : Concrete Folder

public class GaladiaCustomManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public GaladiaCustomManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save2(Alien alien) {
		if (customerCheckService.checkIfRealPerson2(alien)) {
			System.out.println("Saved to Gldn '%\2½7#£ db : " + alien.getBrainColor() + " " + alien.getIQ());

		} else {
			System.out.println("Not a valid Alien");
		}
	}

}
