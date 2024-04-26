
import java.util.*;
import java.io.*;

class fop {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int lineCount = 0, wordCount = 0;
        String line = "";
        FileWriter fw = new FileWriter("Sample.txt");
        // create text file for writing
        System.out.println("Enter data to be inserted in file: ");
        String fileData = sc.nextLine();
        fw.write(fileData);
        fw.close();
        // 1st op completed
        while ((line = sc.nextLine()) != null) {
            lineCount++; // no of lines count
            String[] words = line.split(" ");
            wordCount += words.length;
            // no of words count
        }
        System.out.println("Number of lines is : " +
                lineCount);
        System.out.println("Number of words is : " +
                wordCount);
        sc.close();
    }
}