package hospital;

public class MedicalHistoryNode {
    String treatment;
    MedicalHistoryNode next;

    public MedicalHistoryNode(String treatment) {
        this.treatment = treatment;
        this.next = null;
    }
}
