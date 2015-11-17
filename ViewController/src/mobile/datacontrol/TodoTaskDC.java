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
    
    //Collection with single todo = record to edit in a MAF form. Providing a separate collection for 
    //the selected employee allows implementation of a cancel-form strategy, which is that the collection
    //data - and this the REST service - is only updated in case of a submit. If the user presses cancel 
    //then nothing happens and the navigation returns to the calling page. 
    private TodoTaskEntity[] editableTodoTask = new TodoTaskEntity[0];
    
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
    
    public void setEditableTodoTask(TodoTaskEntity[] todoTaskToEdit){ 
        //create a copy of the object passed for edit. Without copying the todoTask data we 
        //would work on a object reference of the existing object, which makes it difficult 
        //to undo the user edits
        
        ArrayList  todoTasksToEditList = new ArrayList();
                
        if(todoTaskToEdit.length >0){
            todoTasksToEditList.add(todoTaskToEdit[0].clone());
        }
               
        this.editableTodoTask = (TodoTaskEntity[]) todoTasksToEditList.toArray(new TodoTaskEntity[todoTasksToEditList.size()]);
    }

    public TodoTaskEntity[] getEditableTodoTask() {
        return editableTodoTask;
    }
    
    /**
     * Called when preparing to navigate to the details of a to-do task
     * @param id
     */
    public void prepareTodoTasksForDetails(Integer id){ 
        String restURI = TodoTaskURIs.GetTodoTaskDetailsURI(id);
        RestCallerUtil rcu = new RestCallerUtil();
        String jsonArrayAsString = rcu.invokeREAD(restURI);
        TodoTaskEntity[] task = JsonArrayToTodoTasksArray.getTodoTasksArray(jsonArrayAsString);
        //no caching. allTodoTasks is always updated to the recent queried task
        this.allTodoTasks = task;        
        providerChangeSupport.fireProviderRefresh("allTodoTasks");       
    };

    
    protected transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);

    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
    }
    
    public void removeProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.removeProviderChangeListener(l);
    }
}
