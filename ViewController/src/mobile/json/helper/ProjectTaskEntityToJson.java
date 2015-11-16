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
        if(task.getId()!=null){
         sb.append("\"id\":\"");
         sb.append(task.getId()+"\",");
        }
        if(task.getTask_name()!=null){
         sb.append("\"task_name\":\"");
         sb.append(task.getTask_name()+"\",");
        }
        if(task.getProject_name()!=null){
         sb.append("\"project_name\":\"");
         sb.append(task.getProject_name()+"\",");        
        }
        if(task.getPercent_complete()!=null){
         sb.append("\"percent_complete\":\"");
         sb.append(task.getPercent_complete()+"\",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("}");
        String jsonObject = sb.toString();     
        return jsonObject;
    }
}