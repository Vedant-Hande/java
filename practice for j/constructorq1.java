// import java.util.*;

class book {
    String title, author;
    int year;

    book(String tit, String aut, int yae) {
        title = tit;
        author = aut;
        year = yae;

    }

    void show() {
        System.out.println("title : " + title);
        System.out.println("author : " + author);
        System.out.println("year : " + year);
    }

}

public class constructorq1 {
    public static void main(String[] args) {
        book b1 = new book("java", "vedant", 5);
        book b2 = new book("java_advance", "ved", 4);
        b1.show();
        b2.show();
    }
}
