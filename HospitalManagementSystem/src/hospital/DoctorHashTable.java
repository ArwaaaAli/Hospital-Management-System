package hospital;

import java.util.Hashtable;

public class DoctorHashTable {
    Hashtable<Integer, Doctor> doctorTable;

    public DoctorHashTable() {
        doctorTable = new Hashtable<>();
    }

    public void addDoctor(int doctorID, String name, String specialty) {
        Doctor newDoctor = new Doctor(doctorID, name, specialty);
        doctorTable.put(doctorID, newDoctor);
    }

    public Doctor getDoctor(int doctorID) {
        return doctorTable.get(doctorID);
    }

    public void listDoctors() {
        for (Doctor doctor : doctorTable.values()) {
            System.out.println(doctor);
        }
    }
}
