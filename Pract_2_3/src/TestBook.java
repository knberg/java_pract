public class TestBook {

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "J. K. Rowling", "Fantasy", 2000);
        Book b2 = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy", 1960);
        Book b3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", "Fantasy", 1947);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println(b2.getLanguage());
        b2.setLanguage("English");
        System.out.println(b2.getLanguage());
    }
}
