public class parametarised_con {
    int l;
    String b;

    parametarised_con(int x, String y) {
        l = x;
        b = y;

    }

    void getdata() {
        System.out.println("l :" + l + " b : " + b);
    }

    public static void main(String[] args) {
        parametarised_con pr1 = new parametarised_con(1, "vedant");
        pr1.getdata();

    }
}
