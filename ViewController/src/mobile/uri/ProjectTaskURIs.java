package mobile.uri;

public class ProjectTaskURIs {
    
    private static final String PROJECT_TASKS_URI = "/projecttasks";
    
    public static String GetProjectTasksListURI(){ return PROJECT_TASKS_URI; }
    public static String GetProjectTaskDetailsURI(Integer taskId){ 
        return PROJECT_TASKS_URI+"/"+taskId;}
    public static String PutProjectTaskDetailsURI(Integer taskId){ return PROJECT_TASKS_URI+"/"+taskId;}
    public static String DeleteProjectTaskDetailsURI(Integer taskId){ return PROJECT_TASKS_URI+"/"+taskId;}
    
}
