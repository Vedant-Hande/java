package filehandling;
// Write a java program to copy the content of one file to another
import java.io.*;
import java.util.*;

class file1 {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name :");
        String sfile = "input.txt";
        System.out.print("Provide destination file name :");
        String dfile = "output.txt";
        FileReader fin = new FileReader(sfile);
        FileWriter fout = new FileWriter(dfile, true);
        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
        sc.close();
    }
}
