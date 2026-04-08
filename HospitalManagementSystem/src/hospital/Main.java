package hospital;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create Emergency patients
        EmergencyPatient p1 = new EmergencyPatient(1, "Faisal", 3);  // High severity
        EmergencyPatient p2 = new EmergencyPatient(2, "Khaled", 2);  // Medium severity
        EmergencyPatient p3 = new EmergencyPatient(3, "Ahmed", 1);   // Low severity

        // Create a Priority Queue for emergency patients
        PriorityQueue<EmergencyPatient> emergencyQueue = new PriorityQueue<>();
        emergencyQueue.add(p1);
        emergencyQueue.add(p2);
        emergencyQueue.add(p3);

        // Process patients in order of severity
        System.out.println("--- Emergency Queue Treatment Order ---");
        while (!emergencyQueue.isEmpty()) {
            EmergencyPatient patient = emergencyQueue.poll();
            System.out.println("Treating " + patient.name + ", Severity: " + patient.severity);
        }
    }
}
