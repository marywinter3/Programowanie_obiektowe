/**
 * Represents a Customer of the library.
 */
public class Customer {
    private final int id;

    private final String name;
    private final String surname;
    int books_number = 0;

    /**
     * Constructor
     * @param name Name of the customer.
     * @param surname Surname of the customer.
     * @param id Unique identifier of the customer.
     */
    Customer(final String name, final String surname, final int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    /**
     * Gets name of the customer.
     * @return Returns name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets surname of the customer.
     * @return Returns surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets title of the book.
     * @return Returns title.
     */
    public int getBooks_number() {
        return books_number;
    }

    /**
     * Methood
     * @return Returns information about customer as a String.
     */
    public String toString() {
        return "Customer " + id + ": [" + name + " " + surname + "], Books: " + books_number + "\n";
    }
}
