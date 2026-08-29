package week_2.assignment_problems;

import java.util.Scanner;

public class ProductInventoryCSVParser {
    static void parseInventoryRecord(String csvLine) {
// Split the CSV line using comma
String[] fields = csvLine.split(",");
// Check whether exactly 3 fields are present
if (fields.length == 3) {
System.out.println("Product: " + fields[0]
+ " | SKU: " + fields[1]
+ " | Qty: " + fields[2]);
} else {
System.out.println("Invalid Record");
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter inventory record: ");
String csvLine = sc.nextLine();
parseInventoryRecord(csvLine);
sc.close();
}
}
