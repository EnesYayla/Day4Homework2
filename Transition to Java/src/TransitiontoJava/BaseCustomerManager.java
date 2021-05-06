package TransitiontoJava; // Imaginary Location : Abstract Folder

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void save2(Alien alien) {
		System.out.println("Saved to '%\2½7#£ : " + alien.getBrainColor() + " " + alien.getIQ());

	}

	@Override
	public final void complete() { // override etmeden kullan
		System.out.println("Ýþlem Tamamlandý");
	}

}
