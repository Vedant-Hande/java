public class exe6 {
    public static void main(String args[]){
        int fn1=0,fn2=1,fn3,i,n=20;
        for(i=1;i<=n;i++)
        {
            fn3=fn1+fn2;
            System.out.print(" "+fn3);
            fn1=fn2;
  // fn2=fn3;
        }
    }
}
