public class Book {
    private String name;        // название
    private String author;      // автор
    private String genre;       // жанр
    private String language;    // язык
    private int year;           // год издания

    public Book(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.language = "unknown";
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "name: " + this.name + ", author: " + this.author + ", genre: " + this.genre + ", language: " + this.language + ", year: " + this.year;
    }
}