package kg.megacom.arrayListHT;

public class Book {
    private String bookLike;

    public String getBookLike() {
        return bookLike;
    }

    public void setBookLike(String bookLike) {
        this.bookLike = bookLike;
    }

    public Book(String bookLike) {
        this.bookLike = bookLike;

    }

    @Override
    public String toString() {
        return "kg.megacom.arrayListHT.Book{" +
                "nameOfTheBook='" + bookLike + '\'' +
                '}';
    }
}
