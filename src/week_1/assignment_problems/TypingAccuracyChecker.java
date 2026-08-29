package week_1.assignment_problems;

import java.util.Scanner;

public class TypingAccuracyChecker {
    static void checkTypingAccuracy(String original, String typed) {
int matched = 0;
int firstMismatch = -1;
// Compare character by character
for (int i = 0; i < original.length(); i++) {
if (original.charAt(i) == typed.charAt(i)) {
matched++;
}
else if (firstMismatch == -1) {
firstMismatch = i;
}
}
// Calculate accuracy
double accuracy =
((double) matched / original.length()) * 100;
System.out.printf("Matched: %d/%d | Accuracy: %.2f%%",
matched, original.length(), accuracy);
// Display mismatch information
if (firstMismatch == -1) {
System.out.println(" | No Mismatches");
}
else {
System.out.println(" | First Mismatch at position "
+ (firstMismatch + 1)
+ " ('" + original.charAt(firstMismatch)
+ "' vs '" + typed.charAt(firstMismatch) + "')");
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter original passage: ");
String original = sc.nextLine();
System.out.print("Enter typed text: ");
String typed = sc.nextLine();
if (original.length() == typed.length()) {
checkTypingAccuracy(original, typed);
}
else {
System.out.println("Both strings must have equal length.");
}
sc.close();
}
}
