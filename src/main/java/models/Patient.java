package models;

public class Patient {

	private int BLOOD_LEVEL = 20;
	private int HEALTH_LEVEL = 10;
	private String name;
	public Patient(String name) {
		this.name = name;
	
	}


	public String getName() {

		return name;
	}

	public int getBLOOD_LEVEL() {
		return BLOOD_LEVEL;
	}


	public int getHEALTH_LEVEL() {
		return HEALTH_LEVEL;
	}


	public void setBLOOD_LEVEL(int i) {
		BLOOD_LEVEL = BLOOD_LEVEL - i;
		
	}


	public void setHEALTH_LEVEL(int i) {
		HEALTH_LEVEL = HEALTH_LEVEL + i;
	}

}
