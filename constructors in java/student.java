public class student {
    int id;
    String name;
    student(){
        id=101;
        name="vedant";
    }
    void show(){
        System.out.println("id : "+ id + "name : "+ name);
    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.show();
        s2.show();
    }
}
