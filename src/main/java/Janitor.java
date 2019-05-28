
public class Janitor extends NonMedicalEmployee{

	public Janitor(String name, int number,int salary) {
		super(name, number,salary);
		
	}

boolean onThePhone=false;
@Override
public boolean toggles() {
	
	if (onThePhone) {
	return true;
	}
	return false;

}

}
