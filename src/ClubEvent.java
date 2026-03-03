public class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return Math.max(0, 5 - daysUntil);
    }

    @Override
    public String getCategory() {
        return "Club Event";
    }
}