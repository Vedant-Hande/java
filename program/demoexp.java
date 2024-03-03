public class demoexp {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            // ex.printStackTrace();
            System.out.println(ex.toString());

        } finally {
            System.out.println();
            System.out.println("the program will be excuates but the expcetion will be genrated at the run time");
        }
    }
}
