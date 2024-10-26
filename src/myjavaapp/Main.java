package myjavaapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // Starting point of Java application
public static void main(String[] args) {
     // I am adding the filePath to the customer.txt file
     String filePath = "customers.txt";

     System.out.println("Attempting to read the file: " + filePath);
    
 //I am using BufferedReader to read data from the customer file
try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
    System.out.println("File opened succesfully!");
            String line;
     
     // Looping through each line in the file until there's no more data left
while((line = reader.readLine()) != null){
    String[] customerData = line.split(",");
    
 // Making sure there are exactly 4 pieces of info (Name, amount, Discount level, year)
if (customerData.length == 4) {
    String name = customerData[0].trim();
    double amount;
    int discountLevel;
    int year;
    
// Now im Parsing the values for amount, discount level and year
    // Might throw errors if the format is off so ill use try-catch
try {
        amount = Double.parseDouble(customerData[1].trim());
        discountLevel = Integer.parseInt(customerData[2].trim());
        year = Integer.parseInt(customerData[3].trim());
        
        // Calculating the discount based on the level they belong to
        double discount = calculateDiscount(amount, discountLevel);
        double finalAmount = amount - discount;
        
        //Printing the results for each customer so i can see whats going on
        System.out.println("Customer Name:" + name);
        System.out.println("Original Amount:" + amount);
        System.out.println("Discount Level:" + discount);
        System.out.println("Year:" + year);
        System.out.println("Discount Applied:" + discount);
        System.out.println("Final Amount:" + finalAmount);
        System.out.println("----------------------"); 
}
catch (NumberFormatException e){
       // Catching and printing errors related to data format issues
       System.out.println("Error parsing data for customer:" + name);}}

else {
    //If the line dosent have excatly 4 pieces of info it will show an error
    System.out.println("Invalid data format in line:" + line);
  }
 }
}
catch (IOException e) {
    // This will handle any file reading errors
    System.out.println("Error reading the files:" + e.getMessage());
 }
}
    //This is a method to calculate the discount based on the discount level
    private static double calculateDiscount(double amount, int discountLevel) {
        switch (discountLevel) {
            case 1:
                // 10% discount
                return amount * 0.10;
            case 2:
                // 15% discount
                return amount * 0.15;
            case 3:
                // 20% discount
                return amount * 0.20;
            default:
                // No discount for 0 because it is an invalid value
                return 0.0;
        }
    }
}  

