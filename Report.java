import java.util.ArrayList;

//this is the concrete observer class 
public class Report implements Observer {
    ArrayList<Project> projects;
    int totalDone;
    int totalInProgress;

    @Override
    public void update() {
        for (Project project : projects) {
            project.getStatus();
        }
    }

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