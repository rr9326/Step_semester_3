package week_1.assignment_problems;

import java.util.Scanner;

public class MovieReviewProfiler {
    static void classifyWordLengths(String review) {
// Split the review into words
String[] words = review.trim().split("\\s+");
int shortWords = 0;
int mediumWords = 0;
int longWords = 0;
for (int i = 0; i < words.length; i++) {
int length = words[i].length();
if (length >= 1 && length <= 4) {
shortWords++;
}
else if (length >= 5 && length <= 8) {
mediumWords++;
}
else {
longWords++;
}
}
System.out.println("Short: " + shortWords
+ " | Medium: " + mediumWords
+ " | Long: " + longWords);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter movie review: ");
String review = sc.nextLine();
if (!review.trim().isEmpty()) {
classifyWordLengths(review);
}
else {
System.out.println("Review cannot be empty.");
}
sc.close();
}
}
