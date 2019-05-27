
public class Reciptionest extends NonMedicalEmployee {

	public Reciptionest(String name, int number) {
		super(name, number);

	}

	protected int salary = 45000;
	boolean isSweeping = false;
	@Override
	public boolean toggles() {
		
		if (isSweeping) {
			return isSweeping;
		}
		return false;

	}

	

}
