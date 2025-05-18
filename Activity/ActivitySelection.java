import java.util.*;

public class ActivitySelection {

    public List<Activity> selectActivities(List<Activity> activities) {
        Collections.sort(activities);

        List<Activity> selected = new ArrayList<>();
        int lastEndTime = -1;

        for (Activity activity : activities) {
            if (activity.getStart() >= lastEndTime) {
                selected.add(activity);
                lastEndTime = activity.getEnd();
            }
        }

        return selected;
    }
}
