package hospital;

public class MedicalHistory {
    MedicalHistoryNode head;

    public void addTreatment(String treatment) {
        MedicalHistoryNode newNode = new MedicalHistoryNode(treatment);
        newNode.next = head;
        head = newNode;
    }

    public void displayHistory() {
        if (head == null) {
            System.out.println("Medical History: No treatments");
            return;
        }

        System.out.println("Medical History:");
        MedicalHistoryNode current = head;
        while (current != null) {
            System.out.println("- " + current.treatment);
            current = current.next;
        }
    }
}
