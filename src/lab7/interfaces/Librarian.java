package lab7.interfaces;

import java.util.ArrayList;

public interface Librarian
{
    void order(ArrayList<Book> books, Supplier supplier);
}