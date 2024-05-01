
import java.io.*;

public class file_cpy {
    public static void main(String[] args) throws Exception {
        String inputF = "input.txt";
        String outputF = "output.txt";

        try {
            FileInputStream fiStream = new FileInputStream(inputF);
            FileInputStream foStream = new FileInputStream(outputF);

            int num;
            while ((num = fiStream.read()) != -1) {
                //  foStream.Write(num);

            }
            System.out.println(num);
            fiStream.close();
            foStream.close();
            System.out.println("copied");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
