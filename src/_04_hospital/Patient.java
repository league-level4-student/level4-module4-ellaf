package _04_hospital;

public class Patient extends Hospital{

	boolean pulseChecked = false;
	
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		if(pulseChecked == false) {
			return false;
		}else {
			return true;
		}
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		pulseChecked = true;
	}

}
