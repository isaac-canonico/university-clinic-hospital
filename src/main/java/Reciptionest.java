
public class Reciptionest extends NonMedicalEmployee {

	public Reciptionest(String name, int number) {
		super(name, number);

	}

	
	boolean isSweeping = false;
	@Override
	public boolean toggles() {
		
		if (isSweeping) {
			return true;
		}
		return false;

	}
	@Override
	public int getSalary() {
		
		return 45000;
	}

	

}
