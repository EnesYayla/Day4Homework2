package TransitiontoJava; // Imaginary Location : Entities Folder

public class Customer {

	private String firstName;
	private String lastName;
	private int id;
	private String nationallyId;
	private String dateOfBirth;

	public Customer(String firstName, String lastName, int id, String nationallyId, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.nationallyId = nationallyId;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationallyId() {
		return nationallyId;
	}

	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
