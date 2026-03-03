public abstract class PlanItem {
    protected String title;
    protected int daysUntil;
    protected int estimatedHours;
    protected boolean completed;

    public PlanItem(String title, int daysUntil, int estimatedHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getEstimatedHours() {
        return completed ? 0 : estimatedHours;
    }

    public abstract int calculateUrgency();
    public abstract String getCategory();

    public String getSummary() {
        return "[" + getCategory() + "] " + title +
                " | Urgency: " + calculateUrgency() +
                " | Completed: " + completed;
    }
}