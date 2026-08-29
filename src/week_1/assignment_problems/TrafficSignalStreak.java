package week_1.assignment_problems;

import java.util.Scanner;

public class TrafficSignalStreak {
    static void findLongestStreak(String signalLog) {
char longestColor = signalLog.charAt(0);
char currentColor = signalLog.charAt(0);
int longestStreak = 1;
int currentStreak = 1;
for (int i = 1; i < signalLog.length(); i++) {
// If current character is same as previous character
if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
currentStreak++;
}
else {
currentStreak = 1;
currentColor = signalLog.charAt(i);
}
// Update longest streak
if (currentStreak > longestStreak) {
longestStreak = currentStreak;
longestColor = currentColor;
}
}
System.out.println("Longest Streak: '" + longestColor
+ "' repeated " + longestStreak + " times");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter signal log: ");
String signalLog = sc.nextLine();
if (signalLog.length() > 0) {
findLongestStreak(signalLog);
}
else {
System.out.println("Signal log cannot be empty.");
}
sc.close();
}

}
