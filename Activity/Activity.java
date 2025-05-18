public class Activity implements Comparable<Activity> {
    private String name;
    private int start;
    private int end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Activity other) {
        return Integer.compare(this.end, other.end);
    }

    @Override
    public String toString() {
        return name + " (" + start + ", " + end + ")";
    }
}
