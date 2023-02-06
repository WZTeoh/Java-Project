
package javaassignmentclinicappointmentmanagementsystem;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClinicStaffTimetableCode extends Frame implements ActionListener{
    private Label label = new Label("Clinic Staff Timetable");
    private Label labelDate = new Label("Date");
    private Choice chMonth = new Choice();
    private Choice chDay = new Choice();
    private Choice chYear = new Choice();
    private Label labelTime = new Label("Time");
    private Choice chHour = new Choice();
    private Choice chMin = new Choice();
    //private Choice chSec = new Choice();
    private Choice chAmPm = new Choice();
    private Button butAdd = new Button("Add");
    private Dialog dlgAdd = new Dialog(this, "Message",true);
    private Button butdlgOK = new Button("Ok");
    private Button butRem = new Button("Remove");
    private Label labelRec = new Label("Record of the timeslot of Timetable");
    private TextArea TA = new TextArea("",35,35);
    private Button butClose = new Button("Close");
    
    //private TextField tfsen = new TextField("",15);
    
    String optMon;
    String optDay;
    String optYear;
    String optHour;
    String optMin;
    String optAmPm;    
    
    
    String RemMon;
    String RemDay;
    String RemYear;
    
    
    //String sentence1;
    
    String array [][] = {{"Date","Time"}};
    
    public ClinicStaffTimetableCode (){
        add(label);
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
        
        /*
        chSec.add("01");
        chSec.add("02");
        chSec.add("03");
        chSec.add("04");
        chSec.add("05");
        chSec.add("06");
        chSec.add("07");
        chSec.add("08");
        chSec.add("09");
        chSec.add("10");
        chSec.add("11");
        chSec.add("12");
        chSec.add("13");
        chSec.add("14");
        chSec.add("15");
        chSec.add("16");
        chSec.add("17");
        chSec.add("18");
        chSec.add("19");
        chSec.add("20");
        chSec.add("21");
        chSec.add("22");
        chSec.add("23");
        chSec.add("24");
        chSec.add("25");
        chSec.add("26");
        chSec.add("27");
        chSec.add("28");
        chSec.add("29");
        chSec.add("30");
        chSec.add("31");
        chSec.add("32");
        chSec.add("33");
        chSec.add("34");
        chSec.add("35");
        chSec.add("36");
        chSec.add("37");
        chSec.add("38");
        chSec.add("39");
        chSec.add("40");
        chSec.add("41");
        chSec.add("42");
        chSec.add("43");
        chSec.add("44");
        chSec.add("45");
        chSec.add("46");
        chSec.add("47");
        chSec.add("48");
        chSec.add("49");
        chSec.add("50");
        chSec.add("51");
        chSec.add("52");
        chSec.add("53");
        chSec.add("54");
        chSec.add("55");
        chSec.add("56");
        chSec.add("57");
        chSec.add("58");
        chSec.add("59");
        
        add(chSec);
        */
        
        chAmPm.add("AM");
        chAmPm.add("PM");
        
        add(chAmPm);
        
        add(labelRec);
        
        
        
                
        //TA.getText();
        add(TA);
        
        
        
        add(butAdd);
        
        //dlgAdd.add(butdlgOK);
        //dlgAdd.setSize(500,500);
        //add(dlgAdd);
        add(butRem);
        
        
        
        //TA.add(array);
        
        
        add(butClose);
        
        butClose.addActionListener(this);
        butAdd.addActionListener(this);
        butRem.addActionListener(this);
        
        
        setSize(1000,700);
        setLocationRelativeTo(null);
        setTitle("Clinic Staff Timetable");
        setLayout(new FlowLayout());
        setVisible(true);
        
    }
    
        
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == butAdd){
            //sentence1 = tfsen.getText();
            
            optMon = chMonth.getSelectedItem();
            optDay = chDay.getSelectedItem();
            optYear = chYear.getSelectedItem();
            optHour = chHour.getSelectedItem();
            optMin = chMin.getSelectedItem();
            optAmPm = chAmPm.getSelectedItem();
            TA.append(optHour + ":" + optMin + " " + optAmPm + " " + optMon + " " + optDay + ", " + optYear + "\n");
        }
        else if (e.getSource() == butClose){
            System.exit(0);
        }
        else if (e.getSource() == butRem){
            
        }
        
        
    }
    
    
    /*
    public void print(){
        String cid = txtcid.getText();
        
        
        txtprint.setText(txtprint.getText() + "\n");
    }
    */
}
