package com.groovycoder.tddmocking;

import java.util.List;

public interface BookDatabase {

    List<String> fetchAllBooks();

    void save(String books);

}
