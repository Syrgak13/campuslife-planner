public class ExamPreparation extends PlanItem {

    public ExamPreparation(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return Math.max(0, 15 - daysUntil);
    }

    @Override
    public String getCategory() {
        return "Exam Preparation";
    }
}