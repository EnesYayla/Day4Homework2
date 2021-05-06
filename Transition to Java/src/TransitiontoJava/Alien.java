package TransitiontoJava; // Imaginary Location : Entities Folder

public class Alien {

	private String brainColor;
	private int age;
	private int IQ;

	public Alien(String brainColor, int age, int iQ) {
		super();
		this.brainColor = brainColor;
		this.age = age;
		IQ = iQ;
	}

	public String getBrainColor() {
		return brainColor;
	}

	public void setBrainColor(String brainColor) {
		this.brainColor = brainColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int iQ) {
		IQ = iQ;
	}

}
