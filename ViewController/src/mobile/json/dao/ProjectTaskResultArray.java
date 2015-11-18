package mobile.json.dao;
import mobile.entities.ProjectTaskEntity;

public class ProjectTaskResultArray {
    
    private ProjectTaskEntity[] tasks = null;
    
    public ProjectTaskResultArray() {
        super();
    }

    public void setProjectTasks(ProjectTaskEntity[] tasks) {
        this.tasks = tasks;
    }

    public ProjectTaskEntity[] getProjectTasks() {
        return tasks;
    }
}
