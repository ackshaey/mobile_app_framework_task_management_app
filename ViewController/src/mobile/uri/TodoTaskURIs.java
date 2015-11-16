package mobile.uri;

public class TodoTaskURIs {
    
    private static final String TODO_TASKS_URI = "/todotasks";
    
    public static String GetTodoTasksListURI(){ return TODO_TASKS_URI; }
    public static String GetTodoTaskDetailsURI(Integer taskId){ 
        return TODO_TASKS_URI+"/"+taskId;}
    public static String PutTodoTaskDetailsURI(Integer taskId){ return TODO_TASKS_URI+"/"+taskId;}
    public static String DeleteTodoTaskDetailsURI(Integer taskId){ return TODO_TASKS_URI+"/"+taskId;}
    
}
