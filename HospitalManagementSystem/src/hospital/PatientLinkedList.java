package hospital;

public class PatientLinkedList {
    PatientNode head;

    public void addPatient(int id, String name, int age, String contact) {
        PatientNode newPatient = new PatientNode(id, name, age, contact);
        if (head == null) {
            head = newPatient;
        } else {
            PatientNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPatient;
        }
        System.out.println("Patient added: " + name);
    }

    public void updatePatient(int id, String name, int age, String contact) {
        PatientNode current = head;
        while (current != null) {
            if (current.patientID == id) {
                current.name = name;
                current.age = age;
                current.contact = contact;
                System.out.println("Patient updated: " + name);
                return;
            }
            current = current.next;
        }
        System.out.println("Patient not found.");
    }

    public void removePatient(int id) {
        if (head == null) return;

        if (head.patientID == id) {
            head = head.next;
            System.out.println("Patient removed.");
            return;
        }

        PatientNode current = head;
        while (current.next
