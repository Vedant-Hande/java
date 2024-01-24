//concadination in java 

import java.util.Scanner;

public class string_concat {
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    String fname1= sc.next();
    String lname1=sc.next();
     String full_name1 = fname1 + " " + lname1;
     System.out.println(full_name1); 
     sc.close();
   } 
}
