package structures;

import java.util.Stack;

public class TreatmentStack {
    private Stack<String> treatments;

    public TreatmentStack() {
        treatments = new Stack<>();
    }
    public void addTreatment(String treatment) {
        treatments.push(treatment);
    }
    public String getLastTreatment() {
        if (!treatments.isEmpty()) {
            return treatments.peek();
        }
        return "No treatments found.";
    }
    public void displayAllTreatments() {
        System.out.println("Treatment History:");
        for (int i = treatments.size() - 1; i >= 0; i--) {
            System.out.println("- " + treatments.get(i));
        }
    }
    public boolean isEmpty() {
        return treatments.isEmpty();
    }
}

