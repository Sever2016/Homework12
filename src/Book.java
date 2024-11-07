public class Book {
    private int yearOfPublication;
    private Author author;
    private String bookName;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
    }
}
