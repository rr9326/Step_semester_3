package week_1.assignment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
int totalA = 0;
int totalB = 0;
// Calculate totals
for (int i = 0; i < sectionA.length; i++) {
totalA += sectionA[i];
totalB += sectionB[i];
}
// Find highest quantity
int highest = sectionA[0];
String highestSection = "A";
int highestIndex = 0;
for (int i = 0; i < sectionA.length; i++) {
if (sectionA[i] > highest) {
highest = sectionA[i];
highestSection = "A";
highestIndex = i;
}
if (sectionB[i] > highest) {
highest = sectionB[i];
highestSection = "B";
highestIndex = i;
}
}
// Display totals
System.out.print("Section A Total: " + totalA);
System.out.print(" | Section B Total: " + totalB);
// Check whether balanced
if (totalA == totalB) {
System.out.print(" | Status: Balanced");
} else {
System.out.print(" | Status: Not Balanced");
}
// Display highest quantity
System.out.println(" | Highest Quantity: " + highest
+ " (Section " + highestSection
+ ", Item " + (highestIndex + 1) + ")");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of items: ");
int n = sc.nextInt();
int[] sectionA = new int[n];
int[] sectionB = new int[n];
System.out.println("Enter quantities for Section A:");
for (int i = 0; i < n; i++) {
sectionA[i] = sc.nextInt();
}
System.out.println("Enter quantities for Section B:");
for (int i = 0; i < n; i++) {
sectionB[i] = sc.nextInt();
}
analyzeInventory(sectionA, sectionB);
sc.close();
}
}
