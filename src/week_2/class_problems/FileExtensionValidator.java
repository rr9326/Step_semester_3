package week_2.class_problems;

import java.util.Scanner;

public class FileExtensionValidator {
    public static String validateFileExtension(String filename) {

        int dotIndex = filename.lastIndexOf('.');

        // Check if extension exists
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }

        // Extract extension
        String extension = filename.substring(dotIndex + 1);

        // Check accepted extensions
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }

        return "Rejected - invalid file type";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));

        sc.close();
    }
}
