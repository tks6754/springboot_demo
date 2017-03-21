package com.example.service.impl;

import com.example.dal.AuthorDao;
import com.example.pojo.Author;
import com.example.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by miaomu on 17-3-21.
 */
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorDao authorDao;

    @Override
    public int add(Author author) {
        return authorDao.add(author);
    }

    @Override
    public int update(Author author) {
        return authorDao.update(author);
    }

    @Override
    public int delete(Long id) {
        return authorDao.delete(id);
    }

    @Override
    public Author findAuthor(Long id) {
        return authorDao.findAuthor(id);
    }

    @Override
    public List<Author> findAuthorList() {
        return authorDao.findAuthorList();
    }
}
