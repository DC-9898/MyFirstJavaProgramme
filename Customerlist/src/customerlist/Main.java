package customerlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // Starting point of Java application
public static void main(String[] args) {
     // I am adding the file path to the customer.txt file
     String filePath = "customer.txt";
    
 //I am using BufferedReader to read data from the customer file
try (BufferedReader reader = new BufferedReader(new FilePath(filepath))){
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

}

    
    
                
                
                
    }
    
    
    



}


}

