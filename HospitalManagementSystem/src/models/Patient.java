package models;
import java.util.ArrayList;
public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String contact;
    private ArrayList<String> medicalHistory;

    public Patient(int patientId, String name, int age, String contact) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.medicalHistory = new ArrayList<>();
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getContact() {
        return contact;
    }
    public ArrayList<String> getMedicalHistory() {
        return medicalHistory;
    }

    // دالة لإضافة التاريخ الطبي
    public void addMedicalHistory(String history) {
        this.medicalHistory.add(history);
    }
}

