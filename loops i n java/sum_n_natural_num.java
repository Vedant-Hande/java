import java.util.*;
public class sum_n_natural_num {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
    int i,n;
    int sum=0;
    n=sc.nextInt();
    sc.close();
    for (i  = 0; i<=n ; i++) {
        sum=sum+i;
    }
    System.out.println(sum);
}   
}
//    final pi=3.14;