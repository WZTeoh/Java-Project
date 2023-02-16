
package javaassignmentclinicappointmentmanagementsystem;

import java.io.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

public class ClinicStaffTimeslot {
    
    
    
    public ClinicStaffTimeslot(){
        
    }
    
    public void TimeslotReadFiles(){
        
        /*
        try{
            File file = new File("\"C:\\Users\\user\\Desktop\\ClinicStaffTimeslot\\ClinicAppointmentSystemStaffTimeslot.xlsx\"");
            Workbook wb = Workbook.getWorkbook(file);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int column = s.getColumns();
            
            for(int i =0; i<row;i++){
                for(int l=0;l<column;l++){
                    Cell c = s.getCell(l,i);
                    System.out.print(c.getContents()+"\t\t");
                }
                System.out.println("");
            } 
            
            
            
            //FileReader filereader = new FileReader(file);
            //BufferedReader bufferread = new BufferedReader(filereader);
            
            //String[][]
            
        }catch(Exception e){
            System.out.println("Something wrong with the file");
        }*/
    }
    
    public void TimeslotWriteFiles(){
        
        try{
            File file = new File("C:\\Users\\user\\Desktop\\ClinicStaffTimeslot\\clinicstafftimeslot.txt");
            FileWriter filewrite = new FileWriter(file);
            BufferedWriter bufferedwrite = new BufferedWriter(filewrite);
            
            //String [][]table = ;
        }
        catch(Exception e){
            
        }
    }
    
    
}
