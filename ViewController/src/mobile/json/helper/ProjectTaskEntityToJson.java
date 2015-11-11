package mobile.json.helper;

import mobile.entities.ProjectTaskEntity;

public class ProjectTaskEntityToJson {
    public ProjectTaskEntityToJson() {
        super();
    }
    
    /**
     * Converts local project tasks entity to JSON object string
     * Example:
     * {
     *    "id": 1,
     *    "task_name": "Create Project Plan",
     *    "project_name": "Altimetrik PPM Implementation",
     *    "percent_complete": "25.0"
     * }
     * @param task
     * @return
     */
    public static String getJson(ProjectTaskEntity task){
        
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        if(task.getTaskId()!=null){
         sb.append("\"id\":\"");
         sb.append(task.getTaskId()+"\",");
        }
        if(task.getTaskName()!=null){
         sb.append("\"task_name\":\"");
         sb.append(task.getTaskName()+"\",");
        }
        if(task.getProjectName()!=null){
         sb.append("\"project_name\":\"");
         sb.append(task.getProjectName()+"\",");        
        }
        if(task.getPercentComplete()!=null){
         sb.append("\"percent_complete\":\"");
         sb.append(task.getPercentComplete()+"\",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("}");
        String jsonObject = sb.toString();     
        return jsonObject;
    }
}