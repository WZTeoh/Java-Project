package javaassignmentclinicappointmentmanagementsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.Calendar;
import java.sql.Time;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClinicStaff {
    //int Password = password;
    Date date;
    private Time time;
    
    //String ; 
    
    
    
    public void addTimeslot(){
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date date = new Date();
        //System.out.println("The current timeslot available is: "+date);
    }
    
    private void setTime(Time time){
        this.time = time;
    }
    
    private Time getTime(){
        System.out.println(time);
        return time;
    }
    
    
    
    
    public int getPassword(int Password){
        return Password; 
    }
}
