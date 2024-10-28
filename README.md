# My First Java Continuous Assessment 1 (CA1)

## Author
Dean Carroll

## Project Overview
This project is a basic Java application that reads customer data from a file, processes it, and calculates discounts based on specific levels. It is part of my first CA1 project for the Diploma in Applied Software Development at CCT College Dublin.

## Features
- Reads customer data from a `customers.txt` file.
- Processes information such as Name, Amount, Discount Level, and Year.
- Applies discounts based on the discount level:
  - Level 1: 10% discount
  - Level 2: 15% discount
  - Level 3: 20% discount
- Displays customer information, including the final amount after discounts.
- Handles incorrect data formats and parsing errors.

## File Structure
- **Main.java**: Reads and processes customer data, handling calculations.
- **CustomerReader.java**: Handles file reading and data extraction.
- **Customerlist.java**: Manages the display and processing of customer information.

## How to Run
1. Make sure you have Java installed.
2. Clone my repository: git clone https://github.com/DC-9898/My-first-Java-CA.git
3. Place the `customers.txt` file in the correct directory:
C:\Users\deanc\OneDrive\Desktop\myfirstjavaapp-main\myfirstjavaapp-main\customers.txt
4. Open the project in NetBeans or another Java IDE.
5. Run the `Main.java` file to see the customer details.

## Setup Instructions
- Ensure the `customers.txt` file follows this format:
(Name,Amount,DiscountLevel,year)
## Error Handling
- If the `customers.txt` file has incorrect data, the program will notify with an error message.
- Handles parsing errors for non-numeric values in Amount, Discount Level, or Year.

## GitHub Repository
Project repository: [https://github.com/DC-9898/My-first-Java-CA.git](https://github.com/DC-9898/My-first-Java-CA.git)

## Contact
Feel free to reach out with any questions or feedback about the project. Thank you!