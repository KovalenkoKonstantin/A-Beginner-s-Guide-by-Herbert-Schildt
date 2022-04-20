package chapter8_Interfaces.listing3.bookpackext;

// This class is in package bookpackext.

// Use the Book Class from bookpack.
class UseBook {
    public static void main(String args[]) {
        chapter8_Interfaces.listing3.bookpack.Book books[] = new chapter8_Interfaces.listing3.bookpack.Book[5];

        books[0] = new chapter8_Interfaces.listing3.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new chapter8_Interfaces.listing3.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new chapter8_Interfaces.listing3.bookpack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new chapter8_Interfaces.listing3.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new chapter8_Interfaces.listing3.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}
