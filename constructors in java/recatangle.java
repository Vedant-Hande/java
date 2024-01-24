
class recatangle {
    int l, b;
    recatangle(){
        l=135;
        b=12;
    }
    void getdata(){
        System.out.println("area of rectangle : "+(l*b));
    }
    public static void main(String[] args) {
        recatangle rect = new recatangle();
        rect.getdata();
    }
}