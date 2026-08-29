package week_2.class_problems;

import java.util.Scanner;

public class MaskedPhoneNumber {
    public static String maskPhoneNumber(String phone) {

        // Check length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Check if all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Get last 4 digits
        String lastFour = phone.substring(6);

        // Build masked number
        StringBuilder masked = new StringBuilder();

        masked.append("XXXXXX");
        masked.append("-");
        masked.append(lastFour);

        return masked.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.println(maskPhoneNumber(phone));

        sc.close();
    }
}
