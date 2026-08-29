package week_2.assignment_problems;

import java.util.Scanner;

public class LibraryISBNValidator {
    // Normalize the code
static String normalizeCode(String raw) {
String code = raw.trim();
// Avoid substring error if code has fewer than 3 characters
if (code.length() < 3) {
return code;
}
// Uppercase only the first 3 characters
return code.substring(0, 3).toUpperCase()
+ code.substring(3);
}
// Validate and format the code
static String validateAndFormat(String code) {
// Check length
if (code.length() != 13) {
return "Invalid: code must be exactly 13 characters";
}
// Check first 3 characters are letters
for (int i = 0; i < 3; i++) {
if (!Character.isLetter(code.charAt(i))) {
return "Invalid: publisher code must be 3 letters";
}
}
// Check remaining 10 characters are digits
for (int i = 3; i < 13; i++) {
if (!Character.isDigit(code.charAt(i))) {
return "Invalid: body must contain only digits";
}
}
// Extract parts
String publisher = code.substring(0, 3);
String year = code.substring(3, 7);
String catalog = code.substring(7, 13);
// Build formatted output
StringBuilder result = new StringBuilder();
result.append("[");
result.append(publisher);
result.append("] YEAR: ");
result.append(year);
result.append(" | CATALOG: ");
result.append(catalog);
return result.toString();
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter ISBN-style code: ");
String raw = sc.nextLine();
String normalizedCode = normalizeCode(raw);
System.out.println(validateAndFormat(normalizedCode));
sc.close();
}
}
