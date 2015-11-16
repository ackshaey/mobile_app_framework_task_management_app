package mobile.entities;

import java.math.BigDecimal;

import java.util.Date;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class TodoTaskEntity {
    
    private Integer id = null;
    private String task_name = null;
    private String project_name = null;
    private BigDecimal percent_complete = null;
    private Date start_date = null;
    private Date finish_date = null;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public Object clone(){
        TodoTaskEntity task = new TodoTaskEntity();
        task.setId(this.id);
        task.setProject_name(this.project_name);
        task.setPercent_complete(this.percent_complete);
        task.setTask_name(this.task_name);
        task.setStart_date(this.start_date);
        task.setFinish_date(this.finish_date);
        return task;
    }
    
    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange("id", oldId, id);
    }

    public Integer getId() {
        return id;
    }

    public void setTask_name(String task_name) {
        String oldTask_name = this.task_name;
        this.task_name = task_name;
        propertyChangeSupport.firePropertyChange("task_name", oldTask_name, task_name);
    }

    public String getTask_name() {
        return task_name;
    }

    public void setProject_name(String project_name) {
        String oldProject_name = this.project_name;
        this.project_name = project_name;
        propertyChangeSupport.firePropertyChange("project_name", oldProject_name, project_name);
    }

    public String getProject_name() {
        return project_name;
    }

    public void setPercent_complete(BigDecimal percent_complete) {
        BigDecimal oldPercent_complete = this.percent_complete;
        this.percent_complete = percent_complete;
        propertyChangeSupport.firePropertyChange("percent_complete", oldPercent_complete, percent_complete);
    }

    public BigDecimal getPercent_complete() {
        return percent_complete;
    }

    public void setStart_date(Date start_date) {
        Date oldStart_date = this.start_date;
        this.start_date = start_date;
        propertyChangeSupport.firePropertyChange("start_date", oldStart_date, start_date);
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setFinish_date(Date finish_date) {
        Date oldFinish_date = this.finish_date;
        this.finish_date = finish_date;
        propertyChangeSupport.firePropertyChange("finish_date", oldFinish_date, finish_date);
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        PropertyChangeSupport oldPropertyChangeSupport = this.propertyChangeSupport;
        this.propertyChangeSupport = propertyChangeSupport;
        propertyChangeSupport.firePropertyChange("propertyChangeSupport", oldPropertyChangeSupport,
                                                 propertyChangeSupport);
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    public TodoTaskEntity() {
        super();
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
