import java.util.ArrayList;

public class Project extends Subject {
    private String projectID;
    private String projectDesc;
    private ProgressStatus status;

    String getProjectID() {
        return projectID;
    }

    void setTaskID(String taskID) {
        this.projectID = taskID;
    }

    String getTaskDesc() {
        return projectDesc;
    }

    void setTaskDesc(String taskDesc) {
        this.projectDesc = taskDesc;
    }

    ProgressStatus getStatus() {
        return status;
    }

    void setStatus(ProgressStatus status) {
        this.status = status;
    }

    // added code is below
    @Override
    public void attach(Observer o) {

    };

    @Override
    public void detach(Observer o) {

    };

    @Override
    public void notify(ArrayList<Observer> observers) {
        for (Observer o : observers) {
            o.update();
        }
    }

}