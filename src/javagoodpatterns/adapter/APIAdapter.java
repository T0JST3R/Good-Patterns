package javagoodpatterns.adapter;

import javagoodpatterns.adapter.api.LibraryAPI;
import javagoodpatterns.adapter.api.LibraryAPIImpl;
import javagoodpatterns.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {
    private User user;

    private LibraryAPIImpl libraryAPI = new LibraryAPIImpl();

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.user = user;


    }

    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPI.isAviable(bookTitle);
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPI.dueDate(bookTitle , pesel);
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPI.reserve(bookTitle , pesel);
    }
}
