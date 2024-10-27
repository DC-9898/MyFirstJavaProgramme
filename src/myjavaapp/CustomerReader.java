// Author-Dean Carroll
package myjavaapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class CustomerReader {
//Method to read customers from a file
public List<String[]> readCustomers(String filePath){
    List<String[]> customers = new ArrayList<>();
    
    // Im using BufferedReader to read the file line by line
    try (BufferedReader = new BufferedReader(new FileReader(filePath))) {
    
        //Looping through each line until theres no more data
        while ((line = reader.readLine()) != null) {
         
            // Splitting each line into customer data sections
            String[] customerData = line.split(",");
            
            
            
        }
        
    }
        
    }    
  
    
}
