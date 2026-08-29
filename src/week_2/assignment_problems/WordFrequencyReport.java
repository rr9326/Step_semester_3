package week_2.assignment_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyReport {
    static void printFilteredWordFrequency(String feedback) {
// Fixed stop words
String[] stopWords = {
"the", "was", "and", "a", "is", "of", "in"
};
// Convert to lowercase and remove punctuation
feedback = feedback.toLowerCase();
feedback = feedback.replace(".", "");
feedback = feedback.replace(",", "");
// Split into words
String[] words = feedback.split("\\s+");
// Store word frequencies
HashMap<String, Integer> frequency = new HashMap<>();
for (String word : words) {
boolean isStopWord = false;
// Check whether word is a stop word
for (String stop : stopWords) {
if (word.equals(stop)) {
isStopWord = true;
break;
}
}
// Count only non-stop words
if (!isStopWord && !word.isEmpty()) {
if (frequency.containsKey(word)) {
frequency.put(word, frequency.get(word) + 1);
} else {
frequency.put(word, 1);
}
}
}
// Convert entries to a list for sorting
List<Map.Entry<String, Integer>> list =
new ArrayList<>(frequency.entrySet());
// Sort by count in descending order
list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
// Display result
for (Map.Entry<String, Integer> entry : list) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter feedback:");
String feedback = sc.nextLine();
printFilteredWordFrequency(feedback);
sc.close();
}

}
