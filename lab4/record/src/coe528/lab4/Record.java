/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab4;

/**
 *
 * @author Mohamad Alkahil
 */
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Record {
    // Name of the associated file     
    private String filename;  
    private static Record instance=null;
    int i;
   
    private Record(String n) {         
        filename = n; 
    }
    
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.       
    public void read() {         
        try { 
        // Write the code here
        FileReader filein= new FileReader("record.txt");              
        int i;                                                        
            while((i=filein.read()) !=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {             
            System.out.println("An error occurred.");             
            e.printStackTrace();         
        }     
    }
    
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
           FileWriter fileout = new FileWriter("record.txt",true); 
           fileout.write(msg);
           fileout.close();
           
           
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    // Returns a single Record object 
    public static Record GetInstance(){
        if(instance == null){
            instance =new  Record("record.txt");
        }
        return instance;
    }
    

    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        
        Record r= Record.GetInstance();
        
        // Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");

        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();
    }
}
