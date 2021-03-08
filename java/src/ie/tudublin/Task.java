package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;


public class Task {
        private String Task;
        private int Start;
        private int End;
    

    public Task(TableRow row)
    {
        //constructor chaining - So the constructors call each other
        this(
            row.getString("Task"),
            row.getInt("Start"),
            row.getInt("End")
        );
    }


    public Task(String Task, int Start, int End)
    {
        this.Task = Task;
        this.Start = Start;
        this.End = End;
    }

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

    @Override
    public String toString(){
        return "Task [ Task =" + Task + ", Start =" + Start + ", End =" + End + "]";
    }
}