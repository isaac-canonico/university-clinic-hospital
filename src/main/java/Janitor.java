
public class Janitor extends NonMedicalEmployee{

	public Janitor(String name, int number) {
		super(name, number);
		
	}
protected int salary=40000;
boolean onThePhone=false;
@Override
public boolean toggles() {
	
	if (onThePhone) {
	return onThePhone;
	}
	return false;

}

}
