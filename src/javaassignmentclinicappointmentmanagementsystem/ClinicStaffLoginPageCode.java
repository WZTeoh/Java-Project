
package javaassignmentclinicappointmentmanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class ClinicStaffLoginPageCode extends Frame implements ActionListener{
    private Label label = new Label("Clinic Staff Login Page");
    private Label labelusn = new Label("Username: ");
    private TextField tfusn = new TextField("",15);
    private Label labelpass = new Label("Password: ");
    private TextField tfpass = new TextField("",15);
    private Button butExit = new Button("Close");
    private Button butLogin = new Button("Login");
    
    
    
    public ClinicStaffLoginPageCode(){//Constructors
        add(label);
        add(labelusn);
        add(tfusn);
        add(labelpass);
        add(tfpass);
        add(butExit);
        add(butLogin);
        
        //butExit.setLocation(4, 8);                        
        
        
        setSize(350,350);
        setLocationRelativeTo(null);//Location set to center
        setTitle("Clinic Staff Login Page");
        setLayout(new FlowLayout());
        setVisible(true);
        
        butExit.addActionListener(this);//this means this current page
        butLogin.addActionListener(this);
        
    }
    
    /*
    public void checkPass(){
        if(){
            
        }
    }
    */
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == butExit){
            System.exit(0);
        }
        else if(e.getSource() == butLogin){
            dispose();
            
        }
    }
}
