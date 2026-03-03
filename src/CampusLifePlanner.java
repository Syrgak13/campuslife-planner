import java.util.ArrayList;

public class CampusLifePlanner {
    public static void main(String[] args) {

        ArrayList<PlanItem> planner = new ArrayList<>();

        planner.add(new Assignment("Java Homework", 3, 5));
        planner.add(new ExamPreparation("Math Exam", 5, 10));
        planner.add(new ClubEvent("Chess Club", 1, 2));

        System.out.println("=== ALL ITEMS ===");
        for (PlanItem item : planner) {
            System.out.println(item.getSummary());
        }

        planner.get(0).markCompleted();

        System.out.println("\n=== AFTER COMPLETION ===");
        for (PlanItem item : planner) {
            System.out.println(item.getSummary());
        }

        int totalHours = 0;
        PlanItem mostUrgent = null;

        for (PlanItem item : planner) {
            totalHours += item.getEstimatedHours();

            if (!item.isCompleted()) {
                if (mostUrgent == null ||
                        item.calculateUrgency() > mostUrgent.calculateUrgency()) {
                    mostUrgent = item;
                }
            }
        }

        System.out.println("\nTotal remaining hours: " + totalHours);
        System.out.println("Most urgent: " + mostUrgent.getSummary());
    }
}