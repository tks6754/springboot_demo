package com.example.dal;

import com.example.pojo.Author;

import java.util.List;

/**
 * Created by miaomu on 17-3-21.
 */
public interface AuthorDao {
    int add(Author author);
    int update(Author author);
    int delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}
