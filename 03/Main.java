public class Main {
    public static void main(String[] args) {
        Library L = new Library();

        Book B1 = new Book("Animal Farm", "George Orwell", "7846573647852");
        Book B2 = new Book("Pride and Prejudice", "Jane Austen", "7836475825112");
        Book B3 = new Book("The Plague", "Albert Camus", "9876334456725");
        Book B4 = new Book("Anne of the Green Gables", "Lucy Maud Montgomery", "1123443236884");
        Book B5 = new Book("Death of the Nile", "Agatha Christie", "8009655371511");
        Book B6 = new Book("1984", "George Orwell", "2234755612321");
        Book B7 = new Book("Alice in Wonderland", "Lewis Caroll", "6633347561112");
        Book B8 = new Book("Wuthering Heights", "Emily Bronte", "9000477635462");
        Book B9 = new Book("Robinson Crusoe", "Daniel Deofe", "8003546554777");
        Book B10 = new Book("The Adventures of Tom Sawyer", "Mark Twain", "7455566635111");
        Book B11 = new Book("Anne of Avonlea", "Lucy Maud Montgomery", "4650000023466");
        Book B12 = new Book("Little Woman", "Louisa May Alcott", "3321118872210");
        Book B13 = new Book("And Then There Were None", "Agatha Christie", "4768000286453");
        Book B14 = new Book("Five Little Pigs", "Agatha Christie", "4776345552673");
        Book B15 = new Book("Five Feet Apart", "Rachael Lippincott", "8566453334560");

        L.addBook(B1); L.addBook(B2); L.addBook(B3); L.addBook(B4); L.addBook(B5);
        L.addBook(B6); L.addBook(B7); L.addBook(B8); L.addBook(B9); L.addBook(B10);
        L.addBook(B11); L.addBook(B12); L.addBook(B13); L.addBook(B14); L.addBook(B15);

        Customer C1 = new Customer("John", "Smith", 3561);
        Customer C2 = new Customer("Jane", "Williams", 7854);
        Customer C3 = new Customer("Bob", "Jones", 9233);
        Customer C4 = new Customer("David", "Smith", 1453);

        L.addCustomer(C1); L.addCustomer(C2); L.addCustomer(C3); L.addCustomer(C4);
        System.out.println("Customers:\n" + L.toString());
        L.printAvailableBooks();
        System.out.println("----------------------------------------------------\n");

        L.checkOut(B1, C1);
        L.checkOut(B2, C1);
        L.checkOut(B2, C2);
        L.checkOut(B3, C1);
        L.checkOut(B4, C1);
        L.checkOut(B5, C1);
        L.checkOut(B6, C1);
        L.checkOut(B7, C2);
        L.checkOut(B8, C3);
        System.out.println("Customers:\n" + L.toString());
        L.printAvailableBooks();
        System.out.println("----------------------------------------------------\n");

        L.handIn(B7, C2);
        L.handIn(B4, C4);
        L.handIn(B1, C1);
        L.handIn(B2, C1);
        System.out.println("Customers:\n" + L.toString());
        L.printAvailableBooks();
        System.out.println("----------------------------------------------------\n");
    }
}