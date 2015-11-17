package mobile.datacontrol;
import java.text.ParseException;

import java.util.ArrayList;
import mobile.entities.TodoTaskEntity;

import mobile.json.helper.JsonArrayToTodoTasksArray;

import mobile.uri.TodoTaskURIs;

import mobile.util.RestCallerUtil;

import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;

public class TodoTaskDC {
    
    private TodoTaskEntity[] allTodoTasks = null;
    
    public TodoTaskDC() {
        super();
    }
    
    public void setAllTodoTasks(TodoTaskEntity[] allTodoTasks) {}

    public TodoTaskEntity[] getAllTodoTasks() {
        
        if (allTodoTasks == null){
            String restURI = TodoTaskURIs.GetTodoTasksListURI();
            RestCallerUtil rcu = new RestCallerUtil();
            String jsonArrayAsString = rcu.invokeREAD(restURI);
            System.out.println(">>>>>>>>>>>>>>>>>>>>> TodoTaskDC.getAllTodoTasks()");
            System.out.println(jsonArrayAsString);
            TodoTaskEntity[] todoTasks = JsonArrayToTodoTasksArray.getTodoTasksArray(jsonArrayAsString);
            System.out.println(">>>>>>>>>>>>>>>>>>>>> TodoTaskDC.getAllTodoTasks()");
            this.allTodoTasks = todoTasks;
            return this.allTodoTasks;
        }   
        
        return allTodoTasks;
    }
    
    public void refreshList(){
        String restURI = TodoTaskURIs.GetTodoTasksListURI();
        RestCallerUtil rcu = new RestCallerUtil();
        String jsonArrayAsString = rcu.invokeREAD(restURI);
        System.out.println(">>>>>>>>>>>>>>>>>>>>> TodoTaskDC.getAllTodoTasks()");
        System.out.println(jsonArrayAsString);
        TodoTaskEntity[] todoTasks = JsonArrayToTodoTasksArray.getTodoTasksArray(jsonArrayAsString);
        System.out.println(">>>>>>>>>>>>>>>>>>>>> TodoTaskDC.getAllTodoTasks()");
        this.allTodoTasks = todoTasks;
        providerChangeSupport.fireProviderRefresh("allTodoTasks");
    }
    
    protected transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);

    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
    }
    
    public void removeProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.removeProviderChangeListener(l);
    }
}
