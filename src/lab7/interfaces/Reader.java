package lab7.interfaces;

import java.util.ArrayList;

public interface Reader
{
    boolean takeBooks(ArrayList<Book> books, Administrator admin);
    boolean returnBook(ArrayList<Book> books, Administrator admin);
}