/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class Time {
    private int hour;
    private int month;
    private int day;
    private int year;
    private int minute;
    Time(int y, int m, int d, int h, int s){
        hour = h;
        month = m;
        day = d;
        minute = s;
        year = y;
    }
    Time(){
    }
  public int fullTime(){
      String temp;
      int val;
      temp = ""+year+month+day+hour+minute;
      val=Integer.parseInt(temp);
      return(val);
  }
    @Override
  public String toString(){
      return("Year: "+year+" Month: "+month+" Day: "+day+" Hour: "+hour+" Minute: "+minute+"\n");
  }
}
