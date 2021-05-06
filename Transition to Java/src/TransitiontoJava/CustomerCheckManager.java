package TransitiontoJava; // Imaginary Location : Abstract Folder

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	@Override
	public boolean checkIfRealPerson2(Alien alien) {
		return true;

	}

}
