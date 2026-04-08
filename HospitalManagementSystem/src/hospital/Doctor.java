package hospital;

public class Doctor {
    int doctorID;
    String name;
    String specialty;

    public Doctor(int doctorID, String name, String specialty) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorID + ", Name: " + name + ", Specialty: " + specialty;
    }
}
