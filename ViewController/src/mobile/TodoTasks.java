package mobile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TodoTasks {
    private List s_sampleTasks = null;

    public TodoTasks() {
      super();
    }

    public TodoTask[] getSampleTasks() { 
      //This Method gets a list of the employees and their emails 
      TodoTask[] sampleTasks = null; 
      s_sampleTasks = new ArrayList(); 
      s_sampleTasks.add(new TodoTask("Complete Report A", "A.J. Contruction",0, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report B", "B.J. Contruction",5, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report C", "C.J. Contruction",10, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report D", "D.J. Contruction",15, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report E", "E.J. Contruction",20, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report F", "A.J. Contruction",25, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report G", "A.J. Contruction",30, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report H", "A.J. Contruction",35, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report I", "A.J. Contruction",40, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report J", "A.J. Contruction",45, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report K", "A.J. Contruction",50, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report L", "A.J. Contruction",55, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report M", "A.J. Contruction",60, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report N", "A.J. Contruction",65, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report O", "A.J. Contruction",70, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report P", "A.J. Contruction",75, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report Q", "A.J. Contruction",80, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report R", "A.J. Contruction",85, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report S", "A.J. Contruction",90, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report T", "A.J. Contruction",95, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report U", "A.J. Contruction",100, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report V", "A.J. Contruction",100, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report W", "A.J. Contruction",100, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      s_sampleTasks.add(new TodoTask("Complete Report X", "A.J. Contruction",100, getADate(2015,10,22,9,0), getADate(2015,10,25,9,0) ));
      sampleTasks = (TodoTask[]) s_sampleTasks.toArray(new TodoTask[s_sampleTasks.size()]); 
      return sampleTasks; 
    } 

    private Date getADate(int y,int m, int d,int h, int mi) { 
      Calendar c1 = Calendar.getInstance(); 
      c1.set(y, m, d, h, mi); 
      Date retDate = c1.getTime(); 
      return retDate; 
    } 

}

