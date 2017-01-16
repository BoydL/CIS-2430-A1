/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class SchoolActivity {
    private String name;
    private Time startTime;
    private Time endTime;
    SchoolActivity(){
    }
    SchoolActivity(String title, int year, int month, int day, int hour, int minute){
        name=title;
        startTime= new Time(year, month, day, hour, minute);
    }
    public void SetEndTime(int year, int month, int day, int hour, int minute){
        endTime= new Time(year, month, day, hour, minute);
    }
    public String getName()
    {
        return name;
    }
     @Override
    public String toString(){
        return(name+"\n"+"Start time:\n"+startTime.toString()+"End Time:\n"+endTime.toString());
    }
     public int getStartTime(){
        return startTime.fullTime();
    }
    public int getEndTime(){
        return endTime.fullTime();
    }
}
