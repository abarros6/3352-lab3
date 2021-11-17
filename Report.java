import java.util.ArrayList;

public class Report {
    ArrayList<Project> projects;
    int totalDone;
    int totalInProgress;

    public void addProject(Project p) {
        projects.add(p);
    }

    public int getTotalDone() {
        return totalDone;
    }

    public int getTotalInProgress() {
        return totalInProgress;
    }

    // other stats

}