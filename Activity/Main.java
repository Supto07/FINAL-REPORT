import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("A", 0, 6));
        activities.add(new Activity("B", 3, 4));
        activities.add(new Activity("C", 1, 2));
        activities.add(new Activity("D", 5, 9));
        activities.add(new Activity("E", 5, 7));
        activities.add(new Activity("F", 8, 9));

        ActivitySelection selector = new ActivitySelection();
        List<Activity> selected = selector.selectActivities(activities);

        System.out.println("Selected Activities:");
        for (Activity a : selected) {
            System.out.println(a);
        }
    }
}
