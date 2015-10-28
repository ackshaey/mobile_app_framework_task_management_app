package mobile;

import java.util.Date;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class TodoTask {
    
    private String taskName;
    private String project;
    private Integer percentComplete;
    private Date startDate;
    private Date finishDate;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public TodoTask(String taskName, String project, Integer percentComplete, Date startDate, Date finishDate) {
        super();
        this.taskName = taskName;
        this.project = project;
        this.percentComplete = percentComplete;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
    
    public TodoTask(String taskName) {
        super();
        this.taskName = taskName;
    }
    
    public TodoTask() {
        super();
    }

    public void setTaskName(String taskName) {
        String oldTaskName = this.taskName;
        this.taskName = taskName;
        propertyChangeSupport.firePropertyChange("taskName", oldTaskName, taskName);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setProject(String project) {
        String oldProject = this.project;
        this.project = project;
        propertyChangeSupport.firePropertyChange("project", oldProject, project);
    }

    public String getProject() {
        return project;
    }

    public void setPercentComplete(Integer percentComplete) {
        Integer oldPercentComplete = this.percentComplete;
        this.percentComplete = percentComplete;
        propertyChangeSupport.firePropertyChange("percentComplete", oldPercentComplete, percentComplete);
    }

    public Integer getPercentComplete() {
        return percentComplete;
    }

    public void setStartDate(Date startDate) {
        Date oldStartDate = this.startDate;
        this.startDate = startDate;
        propertyChangeSupport.firePropertyChange("startDate", oldStartDate, startDate);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setFinishDate(Date finishDate) {
        Date oldFinishDate = this.finishDate;
        this.finishDate = finishDate;
        propertyChangeSupport.firePropertyChange("finishDate", oldFinishDate, finishDate);
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
