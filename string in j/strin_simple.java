
import java.util.Scanner;
class strin_simple {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name ,full_name;
        System.out.println("Enter yur name : ");
        name= sc.next(); // the sc.next give only one string input like vedant  don'nt include spaces 
        System.out.println("name : "+name);
        System.out.println("Enter yur full name : ");
        full_name= sc.nextLine();// it include the large length string like vedant hande it include spaces also 
        System.out.println("full name : "+full_name);
        sc.close();
    }
}
