class q19 {
    String str;

    q19() {
        str = "default ";

    }

    q19(String str) {
        this.str = str;
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        q19 obj = new q19();
        q19 obj_ = new q19("parameterised");
        obj.display();
        obj_.display();
    }
}
