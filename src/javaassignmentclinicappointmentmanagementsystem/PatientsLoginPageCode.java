
package javaassignmentclinicappointmentmanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientsLoginPageCode extends Frame implements ActionListener{
    private Label label = new Label("Patients Login Page");
    private Label labelusn = new Label("Username: ");
    private TextField tfusn = new TextField("",15);
    private Label labelpass = new Label("Password: ");
    private TextField tfpass = new TextField("",15);
    private Button butExit = new Button("Close");
    private Button butClick = new Button("Login");
    
    public PatientsLoginPageCode(){
        add(label);
        add(labelusn);
        add(tfusn);
        add(labelpass);
        add(tfpass);
        add(butExit);
        add(butClick);
        
        setSize(350,350);
        setLocationRelativeTo(null);//Location set to center
        setTitle("Patients Login Page");
        setLayout(new FlowLayout());
        setVisible(true);
        
        butExit.addActionListener(this);//this means this current page
        butClick.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == butExit){
            System.exit(0);
        }
        else if(e.getSource() == butClick){
            dispose();
            
        }
    }
}
