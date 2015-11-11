package mobile.json.helper;

import java.util.logging.Level;

import mobile.entities.ProjectTaskEntity;
import mobile.json.dao.ProjectTaskResultArray;

import oracle.adfmf.framework.api.JSONBeanSerializationHelper;
import oracle.adfmf.util.logging.Trace;

public class JsonArrayToProjectTasksArray {
    
    public JsonArrayToProjectTasksArray() {
        super();
    }

    @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
    public static ProjectTaskEntity[] getProjectTasksArray(String jsonArrayAsString){
        

        ProjectTaskResultArray projectTasksResult = null;
        
        //object that serializes the JSON payload into the Java object
        JSONBeanSerializationHelper jbsh = new JSONBeanSerializationHelper();
     
        
        try {
            projectTasksResult = (ProjectTaskResultArray) jbsh.fromJSON(ProjectTaskResultArray.class, jsonArrayAsString);           
           

        } catch (Exception e) {
            Trace.log("JSONArray_to_JavaArray",Level.SEVERE, mobile.json.helper.JsonArrayToProjectTasksArray.class,"getProjectTasksArray", "Parsing of REST response failed: "+e.getLocalizedMessage());
        }

      return projectTasksResult.getProjectTasks();
    }
}