package structures;

import models.Patient;
import java.util.LinkedList;

public class PatientLinkedList {
    private LinkedList<Patient> patientsList;

    public PatientLinkedList() {
        this.patientsList = new LinkedList<>();
    }

    public void addPatient(Patient patient) {
        patientsList.add(patient);
    }

    public LinkedList<Patient> getPatients() {
        return patientsList;
    }
}
