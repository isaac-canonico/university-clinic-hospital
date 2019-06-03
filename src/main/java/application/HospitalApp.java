package application;

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
		Employee receptionist1 = new Receptionist("James", 3);
		Employee janitor1 = new Janitor("Carl", 4);
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
		System.out.println("To Administer care to a patient by the doctor, Press 3");
		System.out.println("To Administer care to a patient by the nurse, Press 4");
		System.out.println("To draw blood from a patient by the doctor, Press 5");
		System.out.println("To draw blood from a patient by the nurse, Press 6");
		System.out.println("To pay an employee press 7");
		System.out.println("To exit the program, press 8");

		Scanner input = new Scanner(System.in);
		boolean loop = true;
		do {
			String userInput = input.nextLine();
			System.out.println("Welcome to the University Clinic Hospital!" + "\n");
			System.out.println("Please Enter the Number Corresponding to your interest:" + "\n");
			System.out.println("To see a list of Employees, Press 1");
			System.out.println("To see a list of Patients, Press 2");
			System.out.println("To Administer care to a patient by the doctor, Press 3");
			System.out.println("To Administer care to a patient by the nurse, Press 4");
			System.out.println("To draw blood from a patient by the doctor, Press 5");
			System.out.println("To draw blood from a patient by the nurse, Press 6");
			System.out.println("To pay an employee press 7");
			System.out.println("To exit the program, press 8");

			if (userInput.equals("1")) {
				universityClinic.printEmployeeStats();
				continue;
			} else if (userInput.equals("2")) {

				universityClinic.printPatientStats();

				continue;

			} else if (userInput.equals("3")) {
				doctor1.care(patient1);
				System.out.println("\n" + "You raised the patients health by 5!" );
				universityClinic.printPatientStats();

				continue;
			} else if (userInput.equals("4")) {
				nurse1.care(patient1);
				universityClinic.printPatientStats();
				System.out.println("\n" + "You raised the patients health by 5!");

				continue;
			} else if (userInput.equals("5")) {
				doctor1.drawBlood(patient1);
				universityClinic.printPatientStats();
				System.out.println("\n" + "You lowered the patients blood level by 5!!");

				continue;

			} else if (userInput.equals("6")) {
				nurse1.drawBlood(patient1);
				universityClinic.printPatientStats();
				System.out.println("\n" + "You lowered the patients blood level by 5!");

				continue;

			} else if (userInput.equals("7")) {
				universityClinic.printEmployeeStats();
				System.out.println("\n" + "Which Employee would you like to pay?");
				String payChoice = input.nextLine();
				if (payChoice.equals("JD")) {
					doctor1.paySalary();
					universityClinic.printEmployeeStats();

					continue;
				} else if (payChoice.equals("Sheila")) {
					nurse1.paySalary();
					universityClinic.printEmployeeStats();

					continue;
				} else if (payChoice.equals("James")) {
					receptionist1.paySalary();
					universityClinic.printEmployeeStats();

					continue;
				}
				if (payChoice.equals("Carl")) {
					janitor1.paySalary();
					universityClinic.printEmployeeStats();

					continue;

				} else if (userInput.contentEquals("8")) {
					System.out.println("\n" + "Thanks for using our Hospital System, have a nice day");
					loop = false;
				}
			}
			
			
		} while (loop == true); input.close();
	}
}
// PaySalary() abstract method with no specifications.
// It pays employee types differently by displaying different messages to the
// user.
