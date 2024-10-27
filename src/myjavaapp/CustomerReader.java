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
try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
    String line;
        //Looping through each line until theres no more data
while ((line = reader.readLine()) != null) {
         
    // Splitting each line into customer data sections
    String[] customerData = line.split(",");
            
    // Making sure there are exactly 4 pieces of info (Name, Amount, Discount level. Year)
if (customerData.length == 4){
        // Adding valid customer data to the list
    customers.add(customerData); }
else {
    // If the line dosent have 4 pieces it will show an error
    System.out.println("Invalid data format in line: " + line); }
 } 
}
catch (IOException e) {
    // Handling any file reading errors 
    System.out.println("Error reading the file: " + e.getMessage()); 
}
    // This will return the list of customer data
return customers;
 
 }
}
    