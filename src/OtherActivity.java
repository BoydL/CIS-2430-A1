/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class OtherActivity {
    private String type;
    private String title;
    private Time startTime;
    private Time endTime;
    OtherActivity(){ 
    }
    OtherActivity(String type, String name, int year, int month, int day, int hour, int minute){
        startTime = new Time(year, month, day, hour, minute);
        this.type = type;
        title = name;
    }
    public void SetEndTime(int year, int month, int day, int hour, int minute){
        endTime= new Time(year, month, day, hour, minute);
    }
    public String getName(){
        return title;
    }
     @Override
    public String toString(){
        return(title+"\n"+type+"\n"+"Start time:\n"+startTime.toString()+"End Time:\n"+endTime.toString());
    }
    public int getStartTime(){
        return startTime.fullTime();
    }
    public int getEndTime(){
        return endTime.fullTime();
    }
}
