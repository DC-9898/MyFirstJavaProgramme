// Author - Dean Carroll
package myjavaapp;

import java.util.List;

public class Customerlist {

    public static void main(String[] args) {
        //File path to the customer.txt file
        String filePath = "C:\\\\Users\\\\deanc\\\\OneDrive\\\\Desktop\\\\myfirstjavaapp-main\\\\myfirstjavaapp-main\\\\customers.txt";
        
        // Creating a CustomerReader to read customer data from the file
        CustomerReader reader = new CustomerReader();
        
        //Reading the customer data from the file
        List<String[]> customers = reader.readCustomers(filePath);
        
        // Looping through the list of customers and displaying their info
        for (String[] customerData : customers){
            if (customerData.length == 4){
                String name = customerData[0].trim();
                double amount;
                int discountLevel;
                int year;
                
                
            }
        }
         

  
    
    
    }
}
