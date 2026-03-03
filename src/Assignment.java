public class Assignment extends PlanItem {

    public Assignment(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return Math.max(0, 10 - daysUntil);
    }

    @Override
    public String getCategory() {
        return "Assignment";
    }
}