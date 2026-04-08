package hospital;

public class PatientNode {
    int patientID;
    String name;
    int age;
    String contact;
    MedicalHistory history;
    PatientNode next;

    public PatientNode(int id, String name, int age, String contact) {
        this.patientID = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.history = new MedicalHistory();
        this.next = null;
    }
}
