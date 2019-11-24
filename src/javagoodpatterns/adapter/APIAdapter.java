package javagoodpatterns.adapter;

import javagoodpatterns.adapter.api.LibraryAPI;
import javagoodpatterns.adapter.api.LibraryAPIv2;
import javagoodpatterns.adapter.api.LibraryAPIv2Impl;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {
    private User user;
    private LibraryAPIv2Impl libraryAPIv2 = new LibraryAPIv2Impl();

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.user = user;


    }

    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPIv2.numberOfAviableCopies(bookTitle)> 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle , user.getFirstName() , user.getLastName() , user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle , user.getFirstName() , user.getLastName() , user.getDateOfBirth());
    }
}
