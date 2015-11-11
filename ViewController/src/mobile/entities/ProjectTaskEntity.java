package mobile.entities;

import java.math.BigDecimal;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class ProjectTaskEntity {
    
    private Integer taskId = null;
    private String taskName = null;
    private String projectName = null;
    private BigDecimal percentComplete = null;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);


    public ProjectTaskEntity() {
        super();
    }
    
    public Object clone(){
        ProjectTaskEntity task = new ProjectTaskEntity();
        task.setTaskId(this.taskId);
        task.setProjectName(this.projectName);
        task.setPercentComplete(this.percentComplete);
        task.setTaskName(this.taskName);
        return task;
    }

    public void setTaskId(Integer taskId) {
        Integer oldTaskId = this.taskId;
        this.taskId = taskId;
        propertyChangeSupport.firePropertyChange("taskId", oldTaskId, taskId);
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskName(String taskName) {
        String oldTaskName = this.taskName;
        this.taskName = taskName;
        propertyChangeSupport.firePropertyChange("taskName", oldTaskName, taskName);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setProjectName(String projectName) {
        String oldProjectName = this.projectName;
        this.projectName = projectName;
        propertyChangeSupport.firePropertyChange("projectName", oldProjectName, projectName);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setPercentComplete(BigDecimal percentComplete) {
        BigDecimal oldPercentComplete = this.percentComplete;
        this.percentComplete = percentComplete;
        propertyChangeSupport.firePropertyChange("percentComplete", oldPercentComplete, percentComplete);
    }

    public BigDecimal getPercentComplete() {
        return percentComplete;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
