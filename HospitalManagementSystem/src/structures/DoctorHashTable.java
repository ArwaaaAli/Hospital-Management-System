package structures;

import models.Doctor;
import java.util.ArrayList;

public class DoctorHashTable {
    private ArrayList<Doctor> doctors;

    public DoctorHashTable() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}
