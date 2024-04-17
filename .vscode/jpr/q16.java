public class q16 {
    String str;

    q16() {
        str = " default constructor ";
    }

    q16(String str) {
        this.str = str;
    }

    public void finalize() {
        System.out.println("this is finilize method !");
    }

    void show() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        q16 obj1 = new q16();
        q16 obj2 = new q16("parametarised constructor");
        obj1.show();
        obj2.show();

    }
}
