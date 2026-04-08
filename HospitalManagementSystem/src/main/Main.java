package main;

import models.Patient;
import models.Doctor;
import structures.PatientLinkedList;
import structures.TreatmentStack;
import structures.EmergencyQueue;
import structures.EmergencyQueue.Severity;
import structures.DoctorHashTable;

public class Main {
    public static void main(String[] args) {

        Patient arwa = new Patient(1, "Arwa", 20, "0501234567");
        arwa.addMedicalHistory("Flu Checkup");
        arwa.addMedicalHistory("Blood Test");

        Patient hams = new Patient(2, "Hams", 22, "0502222222");
        hams.addMedicalHistory("Diabetes Treatment");

        PatientLinkedList patientList = new PatientLinkedList();
        patientList.addPatient(arwa);
        patientList.addPatient(hams);

        System.out.println("Patient List:");
        for (Patient patient : patientList.getPatients()) {
            System.out.println("Patient ID: " + patient.getPatientId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Contact: " + patient.getContact());
            System.out.println("Medical History:");
            for (String history : patient.getMedicalHistory()) {
                System.out.println(" - " + history);
            }
            System.out.println("--------------");
        }
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        emergencyQueue.enqueue(arwa, Severity.HIGH);  // Arwa بحالة حرجة
        emergencyQueue.enqueue(hams, Severity.LOW);   // Hams بحالة منخفضة

        System.out.println("\nTesting Emergency Queue:");
        Patient nextPatient = emergencyQueue.dequeue();
        System.out.println("Treating Patient: " + nextPatient.getName());

        System.out.println("\nTesting Treatment History:");
        TreatmentStack arwaTreatments = new TreatmentStack();
        arwaTreatments.addTreatment("X-ray");
        arwaTreatments.addTreatment("Blood Test");

        TreatmentStack hamsTreatments = new TreatmentStack();
        hamsTreatments.addTreatment("MRI");
        hamsTreatments.addTreatment("Antibiotic Injection");

        System.out.println("Last treatment for Arwa: " + arwaTreatments.getLastTreatment());
        System.out.println("Full Treatment History for Arwa:");
        arwaTreatments.displayAllTreatments();

        System.out.println("Last treatment for Hams: " + hamsTreatments.getLastTreatment());
        System.out.println("Full Treatment History for Hams:");
        hamsTreatments.displayAllTreatments();

        System.out.println("\nAssigned Doctors:");
        Doctor doctor1 = new Doctor(101, "Rinad", "Neurology", "Sun-Tue", "6:00 AM - 11:00 AM");
        Doctor doctor2 = new Doctor(102, "Ghadeer", "Cardiology", "Mon-Wed", "7:00 AM - 12:00 PM");

        DoctorHashTable doctorTable = new DoctorHashTable();
        doctorTable.addDoctor(doctor1);
        doctorTable.addDoctor(doctor2);

        for (Doctor doctor : doctorTable.getDoctors()) {
            System.out.println("Doctor ID: " + doctor.getDoctorId());
            System.out.println("Name: " + doctor.getName());
            System.out.println("Dept: " + doctor.getDepartment());
            System.out.println("Schedule: " + doctor.getSchedule());
            System.out.println("Time: " + doctor.getTime()); //ا
            System.out.println("--------------");
        }
    }
}
