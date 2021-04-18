package ie.tudublin;

import processing.data.TableRow;

public class Task {
    private String Task;
    private int Start;
    private int End;

    //constructor that takes processing table row field as a parameter
    public Task(TableRow row){
        this(
            row.getString("Task"),
            row.getInt("Start"),
            row.getInt("End")
        );
    }

    //constructor that takes initial values and assigns them to the fields.
   public Task(String Task, int Start, int End)
    {
        this.Task = Task;
        this.Start = Start;
        this.End =  End;
    }

    //getters and setters
    public String getTask() {
        return Task;
    }
    public void setTask(String task) {
        Task = task;
    }
    public int getStart() {
        return Start;
    }
    public void setStart(int start) {
        Start = start;
    }
    public int getEnd() {
        return End;
    }
    public void setEnd(int end) {
        End = end;
    }

     //to string method
    @Override
    public String toString() {
        return "Task [End=" + End + ", Start=" + Start + ", Task=" + Task + "]";
    }
}
