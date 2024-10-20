import java.lang.reflect.Array;

/**
 * Represents library to manage list of books and list of customers.
 */
public class Library {
    /**
     * List of all customers.
     */
    Customer[] customers = (Customer[]) Array.newInstance(Customer.class, 5);

    /**
     * Object of Array class including list of all books in the library.
     */
    Book[] booksArray = (Book[]) Array.newInstance(Book.class, 5);

    
    void addCustomer(Customer C1) {
        for(int i = 0; i < Array.getLength(customers); i++) {
            if(customers[i] == null) {
                customers[i] = C1;
                return;
            }
            else if(i + 1 == Array.getLength(customers)) {
                Customer[] tempArr = (Customer[]) Array.newInstance(Customer.class, Array.getLength(customers) * 2);
                for(int j = 0; j < Array.getLength(customers); j++) {
                    tempArr[i] = customers[i];
                }
                customers = tempArr;
            }
        }
    }

    
    void addBook(Book B1) {
        int len = getBooksArrayLength();
        int capacity = Array.getLength(booksArray);
        if(len == capacity) {
            Object books = Array.newInstance(Book.class, Array.getLength(this.booksArray) * 2);
            for (int i = 0; i < Array.getLength(this.booksArray); i++)
                Array.set(books, i, Array.get(this.booksArray, i));
            Array.set(books, Array.getLength(this.booksArray), B1);
            this.booksArray = (Book[]) books;
        }
        else {
            booksArray[len] = B1;
        }
    }

    private int getBooksArrayLength() {
        int count = 0;
        for(int i = 0; i < Array.getLength(this.booksArray); i++) {
            if(Array.get(this.booksArray, i) != null)
                count++;
        }
        return count;
    }

    
    void checkOut(Book B1, Customer C1) {
        assert B1.isAvailable();
        if(C1.books_number < 5) {
            C1.books_number++;
            B1.checkOutBook();
            System.out.println("Dodana ksiazka.");
        }
        else
            System.out.println("Nie mozna wypozyczyc wiecej ksiazek!");
    }

    
    void handIn(Book B1, Customer C1) {
        assert C1.books_number > 0;
        C1.books_number--;
        B1.handInBook();
    }


    void printAvailableBooks() {
        System.out.println("Avilable books:");
        for(int i = 0; i < Array.getLength(this.booksArray); i++) {
            Book B1 = (Book) Array.get(this.booksArray, i);
            if (B1 != null && B1.isAvailable()) {
                    System.out.println(B1.toString());
            }
        }
    }

    
    void findBook(String isbn) {
        for(int i = 0; i < Array.getLength(this.booksArray); i++) {
            if(isbn.equals(this.booksArray[i].getISBN()))
                System.out.println(Array.get(this.booksArray, i).toString());
        }
    }

   
    public String toString() {
        StringBuilder str = new StringBuilder();
        Customer C1;
        for(int i = 0; i < Array.getLength(customers); i++) {
            C1 = customers[i];
            if(C1 != null)
                str.append(C1.toString());
        }
        return str.toString();
    }
}