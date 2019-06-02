
public class Patient {

	protected int BLOOD_LEVEL = 20;
	protected int HEALTH_LEVEL = 10;
	private String name;

	public Patient(String name) {
		this.name = name;
		
	}

	public int getBloodLevel() {
		return BLOOD_LEVEL;

	}

	public int getHealthLevel() {
		return HEALTH_LEVEL;
	}

	public String getName() {

		return name;
	}
}
