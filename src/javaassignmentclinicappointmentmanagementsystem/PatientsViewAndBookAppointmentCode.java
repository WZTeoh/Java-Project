package javaassignmentclinicappointmentmanagementsystem;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Array;

public class PatientsViewAndBookAppointmentCode extends Frame implements ActionListener{
    private Label label = new Label("Patients Timetable"); //for Patients to view the timeslot 
    private Label labelAvTimes = new Label("Available Timeslot");
    private TextArea taSlot = new TextArea("",35,35);
    private Label labelchse = new Label("Please choose the Date and Time");
    private Label labelDate = new Label("Date");
    private Choice chMonth = new Choice();
    private Choice chDay = new Choice();
    private Choice chYear = new Choice();
    private Label labelTime = new Label("Time");
    private Choice chHour = new Choice();
    private Choice chMin = new Choice();
    private Choice chAmPm = new Choice();
    private Button butBook = new Button("Book Appointment");
    private Button butCancelApm = new Button("Cancel Appointment");
    private Button butClose = new Button("Close");
    
        
    String optMon;
    String optDay;
    String optYear;
    String optHour;
    String optMin;
    String optAmPm; 
    
    public PatientsViewAndBookAppointmentCode(){
        add(label);
        add(labelAvTimes);
        
                
        //obj3.add(ClinicStaffTimetable.TA);
        add(taSlot);
        
        
        
        add(labelchse);
        add(labelDate);
        
        chMonth.add("January");
        chMonth.add("February");
        chMonth.add("March");
        chMonth.add("April");
        chMonth.add("May");
        chMonth.add("June");
        chMonth.add("July");
        chMonth.add("August");
        chMonth.add("September");
        chMonth.add("October");
        chMonth.add("November");
        chMonth.add("December");
        
        add(chMonth);
        
        chDay.add("1");
        chDay.add("2");
        chDay.add("3");
        chDay.add("4");
        chDay.add("5");
        chDay.add("6");
        chDay.add("7");
        chDay.add("8");
        chDay.add("9");
        chDay.add("10");
        chDay.add("11");
        chDay.add("12");
        chDay.add("13");
        chDay.add("14");
        chDay.add("15");
        chDay.add("16");
        chDay.add("17");
        chDay.add("18");
        chDay.add("19");
        chDay.add("20");
        chDay.add("21");
        chDay.add("22");
        chDay.add("23");
        chDay.add("24");
        chDay.add("25");
        chDay.add("26");
        chDay.add("27");
        chDay.add("28");
        chDay.add("29");
        chDay.add("30");
        chDay.add("31");
        
        add(chDay);
        
        chYear.add("2023");
        chYear.add("2024");
        chYear.add("2025");
        
        add(chYear);
        add(labelTime);
        
        chHour.add("1");
        chHour.add("2");
        chHour.add("3");
        chHour.add("4");
        chHour.add("5");
        chHour.add("6");
        chHour.add("7");
        chHour.add("8");
        chHour.add("9");
        chHour.add("10");
        chHour.add("11");
        chHour.add("12");
        
        add(chHour);
        
        chMin.add("00");
        chMin.add("01");
        chMin.add("02");
        chMin.add("03");
        chMin.add("04");
        chMin.add("05");
        chMin.add("06");
        chMin.add("07");
        chMin.add("08");
        chMin.add("09");
        chMin.add("10");
        chMin.add("11");
        chMin.add("12");
        chMin.add("13");
        chMin.add("14");
        chMin.add("15");
        chMin.add("16");
        chMin.add("17");
        chMin.add("18");
        chMin.add("19");
        chMin.add("20");
        chMin.add("21");
        chMin.add("22");
        chMin.add("23");
        chMin.add("24");
        chMin.add("25");
        chMin.add("26");
        chMin.add("27");
        chMin.add("28");
        chMin.add("29");
        chMin.add("30");
        chMin.add("31");
        chMin.add("32");
        chMin.add("33");
        chMin.add("34");
        chMin.add("35");
        chMin.add("36");
        chMin.add("37");
        chMin.add("38");
        chMin.add("39");
        chMin.add("40");
        chMin.add("41");
        chMin.add("42");
        chMin.add("43");
        chMin.add("44");
        chMin.add("45");
        chMin.add("46");
        chMin.add("47");
        chMin.add("48");
        chMin.add("49");
        chMin.add("50");
        chMin.add("51");
        chMin.add("52");
        chMin.add("53");
        chMin.add("54");
        chMin.add("55");
        chMin.add("56");
        chMin.add("57");
        chMin.add("58");
        chMin.add("59");
        
        add(chMin);
                
        chAmPm.add("AM");
        chAmPm.add("PM");
        
        add(chAmPm);
        add(butBook);        
        add(butCancelApm);
        add(butClose);
        
        butBook.addActionListener(this);
        butCancelApm.addActionListener(this);        
        butClose.addActionListener(this);
        
        setSize(1000,750);
        setLocationRelativeTo(null);
        setTitle("Patients Appointment System");
        setLayout(new FlowLayout());
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == butBook){/*
            optMon = chMonth.getSelectedItem();
            optDay = chDay.getSelectedItem();
            optYear = chYear.getSelectedItem();
            optHour = chHour.getSelectedItem();
            optMin = chMin.getSelectedItem();
            optAmPm = chAmPm.getSelectedItem();
            TA.append(optHour + ":" + optMin + " " + optAmPm + " " + optMon + " " + optDay + ", " + optYear + "\n");
        */}
        else if (e.getSource() == butClose){
            System.exit(0);
        }
        else if (e.getSource() == butCancelApm){
            dispose();
        }
    }
}
