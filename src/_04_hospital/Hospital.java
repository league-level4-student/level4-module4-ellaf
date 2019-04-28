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


	
}
