public class Project {
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

}