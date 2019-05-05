package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	
	public void addPatient(Patient pat) {
		patients.add(pat);
	}
	
	public ArrayList getDoctors() {
		return doctors;
	}
	
	public ArrayList getPatients() {
		return patients;
	}
	ArrayList<Patient> patientsTBA = patients;
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
	for(int i = 0; i < doctors.size(); i++) {
		for(int j = 0; j < patients.size(); j++){
			try {
				doctors.get(i).assignPatient(patients.get(j));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(doctors.get(i).getPatients().size() == 3) {
				i++;
			}
		}
	}
		
	}


	
}
