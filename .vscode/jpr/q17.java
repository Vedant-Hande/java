public class q17 {
    void string_meth() {
        String str = "hello world";

        System.out.println("str length - " + str.length());
        System.out.println("char at index - " + str.charAt(4));
        System.out.println("sub string " + str.substring(6, str.length()));
        System.out.println("concat  " + str.concat(" dear "));
        System.out.println("lower case " + str.toLowerCase());
        System.out.println("uppper case " + str.toUpperCase());
    }

    void StringBuilder_meth() {
        StringBuilder str1 = new StringBuilder("vedant");

        System.out.println("reverse " + str1.reverse());
        // System.out.println("" + str1.insert('v', 5));
        System.out.println("" + str1.replace(1, str1.length(), "sarthak"));
        str1.setCharAt(1, 'm');
        System.out.println(str1);
        if (str1.compareTo(str1) == 0) {
            System.out.println("equal");

        } else {
            System.out.println("not equal ");
        }

        str1.append('h');
        System.out.println(str1);
        str1.append('a');
        System.out.println(str1);
    }

    public static void main(String[] args) {
        q17 obj1 = new q17();
        obj1.string_meth();
        obj1.StringBuilder_meth();
    }
}
