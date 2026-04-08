package structures;
import models.Patient;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {

    public enum Severity {
        HIGH,
        MID,
        LOW
    }
    private static class EmergencyPatient {
        Patient patient;
        Severity severity;

        EmergencyPatient(Patient patient, Severity severity) {
            this.patient = patient;
            this.severity = severity;
        }
    }
    private Comparator<EmergencyPatient> comparator = (a, b) -> {
        return a.severity.ordinal() - b.severity.ordinal(); // HIGH = 0, MID = 1, LOW = 2
    };
    private PriorityQueue<EmergencyPatient> queue = new PriorityQueue<>(comparator);

    public void enqueue(Patient patient, Severity severity) {
        queue.add(new EmergencyPatient(patient, severity));
    }
    public Patient dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll().patient;
        }
        return null;
    }
    public void displayQueue() {
        System.out.println("Emergency Queue:");
        for (EmergencyPatient ep : queue) {
            System.out.println(ep.patient.name + " - Severity: " + ep.severity);
        }
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

