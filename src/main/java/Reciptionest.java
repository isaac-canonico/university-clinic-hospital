
public class Reciptionest extends NonMedicalEmployee {

	public Reciptionest(String name, int number, int salary) {
		super(name, number, salary);

	}

	
	boolean isSweeping = false;
	@Override
	public boolean toggles() {
		
		if (isSweeping) {
			return true;
		}
		return false;

	}

	

}
