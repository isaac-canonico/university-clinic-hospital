package application;

import java.util.Collection;
import java.util.Scanner;

import medicalEmployees.Doctor;
import medicalEmployees.Nurse;
import models.Employee;
import models.Hospital;
import models.Patient;
import nonMedicalEmployees.Janitor;
import nonMedicalEmployees.Receptionist;

public class HospitalApp {

	public static void main(String[] args) {

		Employee doctor1 = new Doctor("JD", 1, "Foot");
		Employee nurse1 = new Nurse("Sheila", 2);
		Patient patient1 = new Patient("Janet");
		Employee receptionist1 = new Receptionist ("James", 3);
		Employee janitor1 = new Janitor ("Carl", 4);
		Hospital universityClinic = new Hospital();
		universityClinic.addEmployee(doctor1);
		universityClinic.addEmployee(nurse1);
		universityClinic.addEmployee(receptionist1);
		universityClinic.addEmployee(janitor1);
		universityClinic.addPatient(patient1);

		System.out.println("Welcome to the University Clinic Hospital!" + "\n");
		System.out.println("Please Enter the Number Corresponding to your interest:" + "\n");
		System.out.println("To see a list of Employees, Press 1");
		System.out.println("To see a list of Patients, Press 2");
		System.out.println("To provide healthcare to a patient, Press 3");
		System.out.println("To pay an employee press 4");
		System.out.println("To exit the program, press 5");

		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();

boolean isRunning;
while(isRunning = true) { 
	 universityClinic.getEmployeeNames();
	 universityClinic.getPatientnames();
		if(userInput.equals("1")) {
			universityClinic.printEmployeeStats();
	
		} else if(userInput.equals("2")) {
		
			universityClinic.printPatientStats();
			
	// provide healthcare
		}  else if(userInput.equals("3")) {
			System.out.println("Please choose the action to be performed" + "/n" + "options are draw blood or care");
			String actionChoice = input.nextLine();
			
			if (actionChoice.equals("draw blood")) {
			universityClinic.printEmployeeStats();
			
			System.out.println("Please choose an Employee to perform the action" + "/n"
			+ "*hint* Nurses impact patients by 3 and doctors by 5");
			String employeeChoice = input.nextLine();
			
			if(employeeChoice.equals("JD")) { 
				doctor1.drawBlood(patient1); 
				universityClinic.printPatientStats();
			} else if (employeeChoice.equals("Sheila")) {
				nurse1.drawBlood(patient1);
				universityClinic.printPatientStats();
			} 
			else if(actionChoice.equals("care")) {
				universityClinic.printEmployeeStats();
				System.out.println("Please choose an Employee to perform the action" + "/n"
				+ "*hint* Nurses impact patients by 3 and doctors by 5");
				String employeeChoice1 = input.nextLine();
				
				if(employeeChoice1.equals("JD")) { 
					doctor1.care(patient1); 
					universityClinic.printPatientStats();
				} else if (employeeChoice1.equals("Sheila")) {
					nurse1.care(patient1);
					universityClinic.printPatientStats();
				}
			}
			}
			
		} else if(userInput.equals("4")) {
			universityClinic.getPatientnames();
			universityClinic.printPatientStats();
			
	
		} else if (userInput.contentEquals("5")) {
			input.close(); 
		} else { isRunning = false;
}
}
	}


// PaySalary() abstract method with no specifications.
// It pays employee types differently by displaying different messages to the
// user.
