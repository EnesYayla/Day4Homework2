package TransitiontoJava; // Imaginary Location : Concrete Folder

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to Strbcks db : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Not a Valid Person");
		}

	}

}
