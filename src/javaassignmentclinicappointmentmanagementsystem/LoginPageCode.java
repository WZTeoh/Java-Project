
package javaassignmentclinicappointmentmanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageCode extends Frame implements ActionListener{
    private Label label = new Label("Login Page");
    private Label label1 = new Label("Are you a Clinic Staff or a Patient? Please select the option");
    private Button butStaff = new Button("I'm a Clinic Staff");
    private Button butPat = new Button("I'm a Patient");
    private Button butExit = new Button("Close");
    
    
    public LoginPageCode(){
        add(label);
        add(label1);
        add(butStaff);
        add(butPat);
        add(butExit);
        
        
        setSize(350,350);
        setLocationRelativeTo(null);//Location set to center
        setTitle("Login Page");
        setLayout(new FlowLayout());
        setVisible(true);
        
        butStaff.addActionListener(this);
        butPat.addActionListener(this);
        butExit.addActionListener(this);  
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == butStaff){
            dispose();
            ClinicStaffLoginPageCode pg = new ClinicStaffLoginPageCode();
        }
        else if (e.getSource() == butPat){
            dispose();
            PatientsLoginPageCode pg1 = new PatientsLoginPageCode();            
        }
        else if (e.getSource() == butExit){
            System.exit(0);
        }
    }
}

