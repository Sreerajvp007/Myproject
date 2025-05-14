
public class Book {

    String title = "Atomic habits";
    String author = "james clear";
    int pages = 250;

    public void bookMethod() {
        System.out.println("title: " + title + "\nauthor: " + author + "\npages: " + pages);

    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.bookMethod();

    }
}
