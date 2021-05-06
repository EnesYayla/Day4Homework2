package TransitiontoJava; // Imaginary Location : Adaptor Folder

// using MernisServiceReferance;

public class MernisServiceAdaptor implements CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {

		// KPSPublicSoapClient client = new KPSPublicSoapClient();
		// return
		// client.tcKimlikNoDogrula(customer.nationallyId,customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth);
		return true; // bu true normalde yok yukarýdaki gizlenen yorummlar var
	}

	@Override
	public boolean checkIfRealPerson2(Alien customer) {
		// KPSPublicSoapClient client = new KPSPublicSoapClient();
		// return
		// client.tcKimlikNoDogrula(customer.nationallyId,customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth);
		return true; // bu true normalde yok yukarýdaki gizlenen yorummlar var
	}
}
