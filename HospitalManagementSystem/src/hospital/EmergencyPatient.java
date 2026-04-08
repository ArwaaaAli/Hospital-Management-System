package hospital;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    int id;
    String name;
    int severity;  // Severity level of the patient (1 - 3)

    // Constructor that accepts id, name, and severity
    public EmergencyPatient(int id, String name, int severity) {
        this.id = id;
        this.name = name;
        this.severity = severity;
    }

    // Compare patients based on severity (higher severity gets treated first)
    @Override
    public int compareTo(EmergencyPatient other) {
        return Integer.compare(other.severity, this.severity); // Compare severity in descending order
    }

    // Override toString method to provide a readable output for the patient
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
