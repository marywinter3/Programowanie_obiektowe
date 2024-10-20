/**
 * Represents a book in the library.
 */
public class Book {
    

    private final String ISBN;
    private final String title;
    private final String author;
    boolean status = true;

    /**
     * Constructor
     * @param title Title of the book.
     * @param author Author of the book.
     * @param ISBN Unique ISBN number.
     */
    Book(final String title, final String author, final String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    /**
     * Gets ISBN.
     * @return Returns ISBN.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets title of the book.
     * @return Returns title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets author of the book.
     * @return Returns author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Checks if book is available to borrow.
     * @return Returns true if book is available.
     */
    boolean isAvailable() {
        return this.status;
    }

    /**
     * Changes status of the book to available.
     */
    void handInBook() {
        this.status = true;
    }

    /**
     * Changes status of the book to unavailable.
     */
    void checkOutBook() {
        this.status = false;
    }

    /**
     * Methood
     * @return Returns information about book as a String.
     */
    public String toString() {
        return ISBN + ": " + this.title + ", " + this.author;
    }
}
