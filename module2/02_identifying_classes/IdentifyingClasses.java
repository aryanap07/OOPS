class Book {
    String title;
    String author;

    void display() {
        System.out.println(title + " by " + author);
    }
}

public class IdentifyingClasses {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Data Structures";
        book.author = "Example Author";
        book.display();
    }
}
