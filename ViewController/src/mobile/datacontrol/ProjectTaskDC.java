package mobile.datacontrol;
import java.text.ParseException;

import java.util.ArrayList;
import mobile.entities.ProjectTaskEntity;

import mobile.entities.TodoTaskEntity;

import mobile.json.helper.ProjectTaskEntityToJson;
import mobile.json.helper.JsonArrayToProjectTasksArray;

import mobile.json.helper.JsonArrayToTodoTasksArray;

import mobile.uri.ProjectTaskURIs;

import mobile.uri.TodoTaskURIs;

import mobile.util.RestCallerUtil;

import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;

public class ProjectTaskDC {
    
    private ProjectTaskEntity[] allProjectTasks = null;
    
    public ProjectTaskDC() {
        super();
    }
    
    public void setAllProjectTasks(ProjectTaskEntity[] allProjectTasks) {}

    public ProjectTaskEntity[] getAllProjectTasks() {
        
        if (allProjectTasks == null){
            String restURI = ProjectTaskURIs.GetProjectTasksListURI();
            RestCallerUtil rcu = new RestCallerUtil();
            String jsonArrayAsString = rcu.invokeREAD(restURI);
            System.out.println(">>>>>>>>>>>>>>>>>>>>> ProjectTaskDC.getAllProjectTasks()");
            System.out.println(jsonArrayAsString);
            ProjectTaskEntity[] projectTasks = JsonArrayToProjectTasksArray.getProjectTasksArray(jsonArrayAsString);
            System.out.println(">>>>>>>>>>>>>>>>>>>>> ProjectTaskDC.getAllProjectTasks()");
            this.allProjectTasks = projectTasks;
            return this.allProjectTasks;
        }   
        
        return allProjectTasks;
    }
    
    public void refreshProjectTaskList(){
        String restURI = ProjectTaskURIs.GetProjectTasksListURI();
        RestCallerUtil rcu = new RestCallerUtil();
        String jsonArrayAsString = rcu.invokeREAD(restURI);
        System.out.println(">>>>>>>>>>>>>>>>>>>>> ProjectTaskDC.getAllProjectTasks()");
        System.out.println(jsonArrayAsString);
        ProjectTaskEntity[] projectTasks = JsonArrayToProjectTasksArray.getProjectTasksArray(jsonArrayAsString);
        System.out.println(">>>>>>>>>>>>>>>>>>>>> ProjectTaskDC.getAllProjectTasks()");
        this.allProjectTasks = projectTasks;
        providerChangeSupport.fireProviderRefresh("allProjectTasks");
    }
    
    protected transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);

    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
    }
    
    public void removeProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.removeProviderChangeListener(l);
    }
}
