package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	
ArrayList<Patient> pats = new ArrayList<Patient>();
	
Doctor(){

}

public boolean performsSurgery() {
	// TODO Auto-generated method stub
	return false;
}

public boolean makesHouseCalls() {
	// TODO Auto-generated method stub
	return false;
}

public void assignPatient(Patient patient) throws DoctorFullException{
	// TODO Auto-generated method stub
	if(pats.size() >= 3) {
		
			throw new DoctorFullException();
		
	}else {
	pats.add(patient);
	}
	
}

public ArrayList getPatients() {
	return pats;
}

public void doMedicine() {
	// TODO Auto-generated method stub
	for(int i = 0; i < pats.size(); i++) {
		pats.get(i).checkPulse();
	}
}


	
}
