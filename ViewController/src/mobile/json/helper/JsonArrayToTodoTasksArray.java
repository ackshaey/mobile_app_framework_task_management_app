package mobile.json.helper;

import java.util.logging.Level;

import mobile.entities.TodoTaskEntity;
import mobile.json.dao.TodoTaskResultArray;

import oracle.adfmf.framework.api.JSONBeanSerializationHelper;
import oracle.adfmf.util.logging.Trace;

public class JsonArrayToTodoTasksArray {
    
    public JsonArrayToTodoTasksArray() {
        super();
    }

    @SuppressWarnings("oracle.jdeveloper.java.semantic-warning")
    public static TodoTaskEntity[] getTodoTasksArray(String jsonArrayAsString){
        

        TodoTaskResultArray todoTasksResult = null;
        
        //object that serializes the JSON payload into the Java object
        JSONBeanSerializationHelper jbsh = new JSONBeanSerializationHelper();
     
        
        try {
            todoTasksResult = (TodoTaskResultArray) jbsh.fromJSON(TodoTaskResultArray.class, jsonArrayAsString);           
           

        } catch (Exception e) {
            Trace.log("JSONArray_to_JavaArray",Level.SEVERE, mobile.json.helper.JsonArrayToTodoTasksArray.class,"getTodoTasksArray", "Parsing of REST response failed: "+e.getLocalizedMessage());
        }

      return todoTasksResult.getTodoTasks();
    }
}