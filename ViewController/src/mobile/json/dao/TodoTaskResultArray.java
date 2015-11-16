package mobile.json.dao;
import mobile.entities.TodoTaskEntity;

public class TodoTaskResultArray {
    
    private TodoTaskEntity[] tasks = null;
    
    public TodoTaskResultArray() {
        super();
    }

    public void setTodoTasks(TodoTaskEntity[] tasks) {
        this.tasks = tasks;
    }

    public TodoTaskEntity[] getTodoTasks() {
        return tasks;
    }
}
