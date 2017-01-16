
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
class DayPlanner {
    /*Checks the user's input to see if there are any number.*/
    public static boolean NumCheck(String input)
    {
        boolean flag=true;
        if(input!=null)
        {
            for(int i=0; i<input.length(); i++){
                if((input.charAt(i)>=0) && (input.charAt(i)<=9))
                {
                    flag=false;
                }
            }
        }
        else
        {
            flag=false;
        }
        return(flag);
    }
    /*Checks the user's input to see if there are any characters.*/
    public static boolean CharCheck(String input)
    {
        boolean flag=true;
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i)))
            {
                flag=false;
            }
        }
        return(flag);
    }
    
    /*Searches the lists for what event the user entered.*/
    public static void Search(ArrayList<HomeActivity> hArray, ArrayList<OtherActivity> oArray, ArrayList<SchoolActivity> sArray, int numHome, int numSchool, int numOther)
    {
        String inputOne=null;
        String inputTwo=null;
        String inputThree=null;
        String type="b";
        String yString=null;
        String dString=null;
        String moString=null;
        String hString=null;
        String mString=null;
        int day=0;
        int month=0;
        int year=0;
        int hour=0;
        int minute=0;
        int eYear=0;
        int eMonth=0;
        int eDay=0;
        int eHour=0;
        int eMinute=0;
        boolean inputCheck=false;
        boolean check=false;
        SchoolActivity schoolSrch;
        HomeActivity homeSrch;
        OtherActivity otherSrch;
        Time startTime;
        Time endTime;
        Scanner sc = new Scanner(System.in);
        System.out.println("What Type of activity are you searching for? H(home), O(other), S(School), Nothing to search all of them");
        inputOne=sc.nextLine();
        System.out.println("What is the name of the activity?\n");
        inputTwo=sc.nextLine();
        System.out.println("Would you like to enter a start or end time? yes) or no ");
        inputThree=sc.nextLine();
        if(inputThree.toLowerCase().equals("yes") && (!inputThree.equals("")))
        {
            inputCheck=true;
            do
            {
                System.out.println("What Year is this happening?\n");
                yString=sc.nextLine();
                System.out.println("What month is this happening?\n");
                moString=sc.nextLine();
                System.out.println("What day is this happening?\n");
                dString=sc.nextLine();
                System.out.println("What hour is this happening on?\n");
                hString=sc.nextLine();
                System.out.println("What minute is this Happening on?\n");
                mString=sc.nextLine();                    
                if(CharCheck(yString) && yString!=null)
                {
                    check=true;
                    year=Integer.parseInt(yString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                
                if(CharCheck(moString) && moString!=null)
                {
                    check=true;
                    month=Integer.parseInt(moString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                 
                if(CharCheck(dString) && dString!=null)
                {
                    check=true;
                    day=Integer.parseInt(dString);
                } 
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                  
                if(CharCheck(hString) && hString!=null)
                {
                    check=true;
                    hour=Integer.parseInt(hString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                   
                if(CharCheck(mString) && mString!=null)
                {
                    check=true;
                    minute=Integer.parseInt(mString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
            }while(check==false);
            check=false;
            do
            {
                System.out.println("What Year is this ending?\n");
                yString=sc.nextLine();
                System.out.println("What month is this ending?\n");
                moString=sc.nextLine();
                System.out.println("What day is this ending?\n");
                dString=sc.nextLine();
                System.out.println("What hour is this ending?\n");
                hString=sc.nextLine();
                System.out.println("What minute is this ending?\n");
                mString=sc.nextLine();                    
                if(CharCheck(yString) && yString!=null)
                {
                    check=true;
                    eYear=Integer.parseInt(yString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                
                if(CharCheck(moString) && moString!=null)
                {
                    check=true;
                    eMonth=Integer.parseInt(moString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                 
                if(CharCheck(dString) && dString!=null)
                {
                    check=true;
                    eDay=Integer.parseInt(dString);
                } 
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                  
                if(CharCheck(hString) && hString!=null)
                {
                    check=true;
                    eHour=Integer.parseInt(hString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
                                   
                if(CharCheck(mString) && mString!=null)
                {
                    check=true;
                    eMinute=Integer.parseInt(mString);
                }
                else
                {
                    check=false;
                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                }
            }while(check==false);
        }
         otherSrch = new OtherActivity(inputTwo, type, year, month, day, hour, minute);
         otherSrch.SetEndTime(eYear, eMonth, eDay, eHour, eMinute);
         schoolSrch = new SchoolActivity(inputTwo, year, month, day, hour, minute);
         schoolSrch.SetEndTime(eYear, eMonth, eDay, eHour, eMinute);
         homeSrch = new HomeActivity(inputTwo, year, month, day, hour, minute);
         homeSrch.SetEndTime(eYear, eMonth, eDay, eHour, eMinute);
         check=false;
        /*all field filled out.*/
        if(!inputOne.equals("") && !inputTwo.equals("") && inputCheck==true)
        {
            System.out.println("Results:\n");
            if(inputOne.toLowerCase().charAt(0)=='o'){
                for(int i=0; i<numOther; i++){
                    if(oArray.get(i).getStartTime()==otherSrch.getStartTime() && oArray.get(i).getEndTime()==otherSrch.getEndTime() && oArray.get(i).getName().toLowerCase().equals(otherSrch.getName().toLowerCase()))
                    {
                        System.out.println(oArray.get(i).toString());
                    }
                }    
            }
            else if(inputOne.toLowerCase().charAt(0)=='s'){
                for(int i=0; i<numSchool; i++){
                    if(sArray.get(i).getStartTime()==schoolSrch.getStartTime() && sArray.get(i).getEndTime()==schoolSrch.getEndTime() && sArray.get(i).getName().toLowerCase().equals(schoolSrch.getName().toLowerCase()))
                    {
                        System.out.println(oArray.get(i).toString());
                    }
                }   
            }
            else if((inputOne.toLowerCase().charAt(0)=='h')){
                for(int i=0; i<numHome; i++){
                    if(hArray.get(i).getStartTime()==homeSrch.getStartTime() && hArray.get(i).getEndTime()==homeSrch.getEndTime() && hArray.get(i).getName().toLowerCase().equals(homeSrch.getName().toLowerCase()))
                    {
                        System.out.println(hArray.get(i).toString());
                    }
                }   
            }
            else
            {
                System.out.println("Invalid input, please re-search");
            }
        }
        /*Time not entered, but array to search and name entered.*/
        else if(!inputOne.equals("") && !inputTwo.equals("") && inputCheck==false)
        {
            System.out.println("Results:\n");
            if(inputOne.toLowerCase().charAt(0)=='o'){
                for(int i=0; i<numOther; i++){  
                    if(oArray.get(i).getName().toLowerCase().equals(otherSrch.getName().toLowerCase())){
                        System.out.println(oArray.get(i).toString());
                    }
                }
            }
            else if(inputOne.toLowerCase().charAt(0)=='h'){
                for(int i=0; i<numHome; i++){
                    if(hArray.get(i).getName().toLowerCase().equals(homeSrch.getName().toLowerCase())){
                        System.out.println(hArray.get(i).toString());
                    }
                }
                
            }
            else if(inputOne.toLowerCase().charAt(0)=='s'){
                for(int i=0; i<numSchool; i++){
                    if(sArray.get(i).getName().toLowerCase().equals(schoolSrch.getName().toLowerCase())){
                        System.out.println(sArray.get(i).toString());
                    }
                }    
            } 
            else
            {
                System.out.println("Invalid input, please re-search");
            }
        }
        /*print identified array*/
        else if(!inputOne.equals("") && inputTwo.equals("") && inputCheck==false)
        {
            System.out.println("Results:\n");
            if(inputOne.toLowerCase().charAt(0)=='o'){
                for(int i=0; i<numOther; i++){                    
                    System.out.println(oArray.get(i).toString());
                }
            }
            else if(inputOne.toLowerCase().charAt(0)=='h'){
                for(int i=0; i<numHome; i++){
                    System.out.println(hArray.get(i).toString());
                }
                
            }
            else if(inputOne.toLowerCase().charAt(0)=='s'){
                for(int i=0; i<numSchool; i++){
                    System.out.println(sArray.get(i).toString());
                }    
            }
            else{
                System.out.println("Invalid input, please re-search");
            }
        }
        /*print everything in specific array at specific start and end time*/
        else if(!inputOne.equals("") && inputTwo.equals("") && inputCheck==true)
        {
              System.out.println("Results:\n");
              if(inputOne.toLowerCase().charAt(0)=='o'){
                for(int i=0; i<numOther; i++){
                    if(oArray.get(i).getStartTime()==otherSrch.getStartTime() && oArray.get(i).getEndTime()==otherSrch.getEndTime())
                    {
                        System.out.println(oArray.get(i).toString());
                    }
                }
            }
            else if(inputOne.toLowerCase().charAt(0)=='h'){
                for(int i=0; i<numHome; i++){
                    if(sArray.get(i).getStartTime()==schoolSrch.getStartTime() && sArray.get(i).getEndTime()==schoolSrch.getEndTime())
                    {
                        System.out.println(oArray.get(i).toString());
                    }
                }
                
            }
            else if(inputOne.toLowerCase().charAt(0)=='s'){
                for(int i=0; i<numSchool; i++){
                    if(hArray.get(i).getStartTime()==homeSrch.getStartTime() && hArray.get(i).getEndTime()==homeSrch.getEndTime())
                    {
                        System.out.println(hArray.get(i).toString());
                    }
                }    
            } 
           
        }
        /*search all arrays for events in sepcific time period*/
        else if(inputOne.equals("") && inputTwo.equals("") && inputCheck==true)
        {
            System.out.println("Results:\n");
            for(int i=0; i<numOther; i++){
                if(oArray.get(i).getStartTime()==otherSrch.getStartTime() && oArray.get(i).getEndTime()==otherSrch.getEndTime())
                {
                    System.out.println(oArray.get(i).toString());
                }
            }
            for(int i=0; i<numSchool; i++){
                if(sArray.get(i).getStartTime()==schoolSrch.getStartTime() && sArray.get(i).getEndTime()==schoolSrch.getEndTime())
                {
                    System.out.println(oArray.get(i).toString());
                }
            }
            for(int i=0; i<numHome; i++){
                if(hArray.get(i).getStartTime()==homeSrch.getStartTime() && hArray.get(i).getEndTime()==homeSrch.getEndTime())
                {
                    System.out.println(hArray.get(i).toString());
                }
            }
        }
        /*search all arrays with corresponding name of event and time*/
        else if(inputOne.equals("") && !inputTwo.equals("") && inputCheck==true)
        {
            System.out.println("Results:");
            for(int i=0; i<numOther; i++){
                if(oArray.get(i).getStartTime()==otherSrch.getStartTime() && oArray.get(i).getEndTime()==otherSrch.getEndTime() && oArray.get(i).getName().toLowerCase().equals(otherSrch.getName().toLowerCase()))
                {
                    System.out.println(oArray.get(i).toString());
                }
            }
            
            for(int i=0; i<numSchool; i++){
                if(sArray.get(i).getStartTime()==schoolSrch.getStartTime() && sArray.get(i).getEndTime()==schoolSrch.getEndTime() && sArray.get(i).getName().toLowerCase().equals(schoolSrch.getName().toLowerCase()))
                {
                    System.out.println(oArray.get(i).toString());
                }
            }
            for(int i=0; i<numHome; i++){
                if(hArray.get(i).getStartTime()==homeSrch.getStartTime() && hArray.get(i).getEndTime()==homeSrch.getEndTime() && hArray.get(i).getName().toLowerCase().equals(homeSrch.getName().toLowerCase()))
                {
                    System.out.println(hArray.get(i).toString());
                }
            }   
        }
        /*search all arrays for corresponding name*/
        else if(inputOne.equals("") && !inputTwo.equals("") && inputCheck==false)
        {
            System.out.println("Results:");
            for(int i=0; i<numOther; i++){
                if(oArray.get(i).getName().toLowerCase().equals(otherSrch.getName().toLowerCase()))
                {
                    System.out.println(oArray.get(i).toString());
                }
            }
            for(int i=0; i<numHome; i++){
                if(hArray.get(i).getName().toLowerCase().equals(homeSrch.getName().toLowerCase()))
                {
                    System.out.println(hArray.get(i).toString());
                }
            }
            for(int i=0; i<numSchool; i++){
                if(sArray.get(i).getName().toLowerCase().equals(schoolSrch.getName().toLowerCase()))
                {
                    System.out.println(sArray.get(i).toString());
                }
            }   
        }
        /*print all events*/
        else if(inputOne.equals("") && inputTwo.equals("") && inputCheck==false)
        {
            System.out.println("Results:");
            for(int i=0; i<numOther; i++){  
                System.out.println(oArray.get(i).toString());                
            }
            for(int i=0; i<numHome; i++){
                System.out.println(hArray.get(i).toString());
            }
            for(int i=0; i<numSchool; i++){
                System.out.println(sArray.get(i).toString());
            }      
        }
    }
    
   /*
    
    
    
    
    
    
    */
    
     public static void main(String[] args){
         ArrayList<HomeActivity> homeArray = new ArrayList<>();/*Contains all home activity objects*/
         ArrayList<OtherActivity>  otherArray = new ArrayList<>();/*Contains all other activity objects*/
         ArrayList<SchoolActivity> schoolArray = new ArrayList<>();/*Contains all school activity objects*/
         int choice=0;
         int day=0;
         int month=0;
         int year=0;
         int hour=0;
         int minute=0;
         int numHome=0;
         int numOther=0;
         int numSchool=0;
         String input=null;
         String name=null;
         String yString=null;
         String dString=null;
         String moString=null;
         String hString=null;
         String mString=null;
         boolean check=false;
         Scanner sc = new Scanner(System.in);
         System.out.println("Hello, and welcome to the Day Planner!\n");
         /*Takes in the users input at the menu and does appropriate action.*/
         do
         {
            System.out.println("Please select one of the following options by entering the corresponding number:\n"
                    + "1.) Add an event.\n"
                    + "2.) Search an event.\n"
                    + "3.) Exit.\n");
            input=sc.nextLine();
            if(CharCheck(input) && !input.equals("")){
                choice=Integer.parseInt(input);
            }
            else
            {
                System.out.println("Error, not a number input.\n");
            }
            switch(choice){
                case 1:
                    System.out.println("What type of event are you adding?O(other), H(Home), S(school)");
                    input=sc.nextLine();
                    if(NumCheck(input) && !input.equals(""))
                    {
                        /*adding other activity*/
                        if(input.charAt(0)=='O' || input.charAt(0)=='o')
                        {   
                           System.out.println("What is the title of the activity?\n");
                            input=sc.nextLine();
                            System.out.println("What type of activity is it?\n");
                            name=sc.nextLine();
                            /*Asks the user for the start time of the activity*/
                            do
                            {
                                System.out.println("What Year is this happening?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this happening?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this happening?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this happening on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this Happening on?\n");
                                mString=sc.nextLine();
                                
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                            }while(check==false);
                            otherArray.add(new OtherActivity(name, input, year, month, day, hour, minute));
                            check=false;
                            /*Asks the user for the end time of the activity and fully sets values for all variables in the object*/
                            do
                            {
                                System.out.println("What Year is this ending on?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this ending on?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this ending on?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this ending on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this ending on?\n");
                                mString=sc.nextLine();
                                
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                            }while(check==false);
                            otherArray.get(numOther).SetEndTime(year, month, day, hour, minute);
                            numOther++;
                        }
                        
                        /*adding home activity*/
                        else if(input.charAt(0)=='H' || input.charAt(0)=='h')
                        {
                            System.out.println("What is the title of the activity?\n");
                            input=sc.nextLine();
                            /*adding start time*/
                            do
                            {
                                System.out.println("What Year is this happening?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this happening?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this happening?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this happening on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this happening on?\n");
                                mString=sc.nextLine();
                                
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                            }while(check==false);
                            homeArray.add(new HomeActivity(input, year, month, day, hour, minute));
                            check=false;
                            /*adding end time*/
                            do
                            {
                                System.out.println("What Year is this ending on?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this ending on?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this ending on?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this ending on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this ending on?\n");
                                mString=sc.nextLine();
                                
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                            }while(check==false);
                            homeArray.get(numHome).SetEndTime(year, month, day, hour, minute);
                            numHome++;
                        }
                        
                        /*adding school activity*/
                        else if(input.charAt(0)=='S' || input.charAt(0)=='s')
                        {
                            System.out.println("What is the title of the activity?\n");
                            input=sc.nextLine();
                            do
                            {
                                System.out.println("What Year is this happening?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this happening?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this happening?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this happening on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this happening on?\n");
                                mString=sc.nextLine();
                                /*adding start time*/
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                            }while(check==false);
                            schoolArray.add(new SchoolActivity(input, year, month, day, hour, minute));
                            check=false;
                            /*adding end time*/
                            do
                            {
                                System.out.println("What Year is this ending on?\n");
                                yString=sc.nextLine();
                                System.out.println("What month is this ending on?\n");
                                moString=sc.nextLine();
                                System.out.println("What day is this ending on?\n");
                                dString=sc.nextLine();
                                System.out.println("What hour is this ending on?\n");
                                hString=sc.nextLine();
                                System.out.println("What minute is this ending on?\n");
                                mString=sc.nextLine();
                                
                                if(CharCheck(yString) && !yString.equals(""))
                                {
                                    check=true;
                                    year=Integer.parseInt(yString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the year you entered or you entered nothing. Please re enter the time.\n");
                                }
                                
                                if(CharCheck(moString) && !moString.equals(""))
                                {
                                    check=true;
                                    month=Integer.parseInt(moString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the month you entered or you entered nothing. Please re enter the time.\n");
                                }
                                 
                                if(CharCheck(dString) && !dString.equals(""))
                                {
                                    check=true;
                                    day=Integer.parseInt(dString);
                                } 
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the day you entered or you entered nothing. Please re enter the time.\n");
                                }
                                  
                                if(CharCheck(hString) && !hString.equals(""))
                                {
                                    check=true;
                                    hour=Integer.parseInt(hString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the hour you entered or you entered nothing. Please re enter the time.\n");
                                }
                                   
                                if(CharCheck(mString) && !mString.equals(""))
                                {
                                    check=true;
                                    minute=Integer.parseInt(mString);
                                }
                                else
                                {
                                    check=false;
                                    System.out.println("There was a character in the minute you entered or you entered nothing. Please re enter the time.\n");
                                }
                            }while(check==false);
                            schoolArray.get(numSchool).SetEndTime(year, month, day, hour, minute);
                            numSchool++;
                        }
                        else
                        {
                            System.out.println("You entered a number please re enter with the correct input.");
                        }
                    }
                    else
                    {
                        System.out.println("Error, a number was entered. Please enter only the corresponding characters of the event you are choosing to enter.\n");
                    }
                    break;
                case 2:
                    Search(homeArray, otherArray, schoolArray, numHome, numOther, numSchool);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("At the next menu, please enter an appropriate number.\n");
                    break;
            }
         }while(choice!=3);
        System.out.println("Exitng... Have a nice day!");
    }
}
