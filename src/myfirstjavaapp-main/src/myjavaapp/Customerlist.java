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
                
                // Now im parsing the values for amount, discount level and year
                try {
                    amount = Double.parseDouble(customerData[1].trim());
                    discountLevel = Integer.parseInt(customerData[2].trim());
                    year = Integer.parseInt(customerData[3].trim());
                    
                    // Calculating the discount based on the level they belong to#
                    double discount =  calculateDiscount(amount, discountLevel);
                    double finalAmount = amount - discount;
                    
                    // Printing the results for each customer
                    System.out.println("Customer Name: " + name);
                    System.out.println("Original Amount: " + amount);
                    System.out.println("Discount Level: " + discountLevel);
                    System.out.println("Year: " + year);
                    System.out.println("Discount Applied: " + discount);
                    System.out.println("Final Amount: " + finalAmount);
                    System.out.println("----------------------"); }
               
                catch (NumberFormatException e) {
                    // catching and printing errors if theres an issue with the data format
                    System.out.println("Error parsing data for customer: " + name); } }
            
            else {
                // If the line dosent have exactly 4 pieces of info it will show an error
                System.out.println("Invalid data format in line: " + String.join(",", customerData));
   }
  } 
 }
        private static double calculateDiscount(double amount, int discountLevel) {
            switch (discountLevel){
                case 1:
                    return amount * 0.10;
                case 2:
                    return amount * 0.15;
                case 3:
                    return amount * 0.20;
                default:
                    return 0.0;
  }
 }
}
