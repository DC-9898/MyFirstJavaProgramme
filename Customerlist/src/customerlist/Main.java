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
     
