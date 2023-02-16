
package javaassignmentclinicappointmentmanagementsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JOptionPane;


public class ClinicStaffModifyTimeslot extends javax.swing.JFrame {

         
    LocalDate pickdate = datePickerDate.getDate();
    LocalTime pickTime = timePickerTime.getTime();
    
    
    public ClinicStaffModifyTimeslot() {
        initComponents();
        setTitle("Clinic Staff Modify Timeslot");
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDate = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelModTime = new javax.swing.JLabel();
        datePickerDate = new com.github.lgooddatepicker.components.DatePicker();
        timePickerTime = new com.github.lgooddatepicker.components.TimePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTimeslot = new javax.swing.JTable();
        butAdd = new javax.swing.JButton();
        butRem = new javax.swing.JButton();
        butClose = new javax.swing.JButton();
        labelDateSelect = new javax.swing.JLabel();
        labelTimeSelect = new javax.swing.JLabel();
        tfDateSelect = new javax.swing.JTextField();
        tfTimeSelect = new javax.swing.JTextField();
        butEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDate.setText("Date: ");

        labelTime.setText("Time: ");

        labelModTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModTime.setText("Modify Timeslot");
        labelModTime.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tableTimeslot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Available Date", "Available Time"
            }
        ));
        tableTimeslot.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableTimeslotComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableTimeslot);

        butAdd.setText("Add Timeslot");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        butRem.setText("Remove Timeslot");

        butClose.setText("Close");
        butClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCloseActionPerformed(evt);
            }
        });

        labelDateSelect.setText("Date Selected: ");

        labelTimeSelect.setText("Time Selected: ");

        butEdit.setText("Edit Timeslot");
        butEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelModTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datePickerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(labelTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timePickerTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelDateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelTimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfTimeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                            .addComponent(tfDateSelect))))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(butAdd)
                .addGap(29, 29, 29)
                .addComponent(butEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butRem)
                .addGap(32, 32, 32)
                .addComponent(butClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelModTime)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDate)
                    .addComponent(labelTime)
                    .addComponent(datePickerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePickerTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateSelect)
                    .addComponent(tfDateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTimeSelect)
                    .addComponent(tfTimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAdd)
                    .addComponent(butRem)
                    .addComponent(butClose)
                    .addComponent(butEdit))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableTimeslotComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableTimeslotComponentShown
        
        /*
        String filePath = "\"C:\\Users\\user\\Desktop\\ClinicAppointmentSystemStaffTimeslot.txt\"";
        File file = new File(filePath);
        
        try {
            BufferedReader br =  new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)tableTimeslot.getModel();
            model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();
            
            } 
        
        catch (Exception ex) {
            Logger.getLogger(ClinicStaffModifyTimeslot.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_tableTimeslotComponentShown

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed

        
        //LocalDate pickdate = datePickerDate.getDate();
        //LocalTime pickTime = timePickerTime.getTime();
        
        //DefaultTableModel tblModel = (DefaultTableModel)tableTimeslot.getModel();
        //tblModel.addRow(new Object[]{"",pickdate,pickTime});
        
        /*
        try{
            File file = new File("C:\\Users\\user\\Desktop\\ClinicStaffTimeslot\\clinicstafftimeslot.txt");
            FileWriter filewrite = new FileWriter(file);
            BufferedWriter bufferedwrite = new BufferedWriter(filewrite);
                        
            int No = 1;
            int count = 0;
            
            
            //bufferedwrite.write(table);
            bufferedwrite.write(new Object [][] table = {{No, pickdate, pickTime}});
            
        }
        catch(Exception e){
            
        }*/
        
        
        //JOptionPane.showMessageDialog(null, "Something wrong with the file, please check your file", "Error", JOptionPane.ERROR_MESSAGE);
               
        
        try{
            File file = new File("C:\\Users\\user\\Desktop\\ClinicStaffTimeslot\\timeslot.txt");
            FileWriter filewrite = new FileWriter(file);
            BufferedWriter bufferedwrite = new BufferedWriter(filewrite);
            
            
            
            int No = 1;
            int count = 0;
            Object [][] table = {{No, pickdate, pickTime}};
            for(int i=0;i<tableTimeslot.getRowCount();i++){
                //String line;
                for(int j=0;j<tableTimeslot.getColumnCount();j++){
                    No = i;
                    count++;
                    bufferedwrite.write(tableTimeslot.getValueAt(i, j).toString()+" ");
                }
                bufferedwrite.newLine();
            }
            
            
            DefaultTableModel tblModel = (DefaultTableModel)tableTimeslot.getModel();
            tblModel.addRow(table);            
            
            JOptionPane.showMessageDialog(null, "Your timeslot has been successfully added!","Timeslot has been added",JOptionPane.INFORMATION_MESSAGE);
                        
                        
            bufferedwrite.flush();
            bufferedwrite.close();
        }
        catch(FileNotFoundException e){
            
        }
        catch(/*DateFormatException*/ Exception e){//Clinic Staff <user> cannot select the date and time that is already past, system catch these exception
            JOptionPane.showMessageDialog(null, "You can only select future date and time","Error Message",JOptionPane.ERROR_MESSAGE);
                        
        }
        
            
        /*
        
            for(int i = 0; i<tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                //String[] dataRow = line.split("/");
                String datePick = datePickerDate.getDateStringOrSuppliedString(firstLine);

                model.addRow(tableLines);
                model.addRow((String)datePick);
            }*/

        
    }//GEN-LAST:event_butAddActionPerformed

    private void butCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butCloseActionPerformed

    private void butEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtmodel = (DefaultTableModel) tableTimeslot.getModel();
        int x = tableTimeslot.getSelectedRow();
        
        try{            
            tfDateSelect.setText(dtmodel.getValueAt(x, 1).toString());
            tfTimeSelect.setText(dtmodel.getValueAt(x, 2).toString());                   
        }
        catch(Exception e){
            
        }
        
        
        
        
        
    }//GEN-LAST:event_butEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClinicStaffModifyTimeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicStaffModifyTimeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicStaffModifyTimeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicStaffModifyTimeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicStaffModifyTimeslot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butClose;
    private javax.swing.JButton butEdit;
    private javax.swing.JButton butRem;
    private com.github.lgooddatepicker.components.DatePicker datePickerDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDateSelect;
    private javax.swing.JLabel labelModTime;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTimeSelect;
    private javax.swing.JTable tableTimeslot;
    private javax.swing.JTextField tfDateSelect;
    private javax.swing.JTextField tfTimeSelect;
    private com.github.lgooddatepicker.components.TimePicker timePickerTime;
    // End of variables declaration//GEN-END:variables
}
