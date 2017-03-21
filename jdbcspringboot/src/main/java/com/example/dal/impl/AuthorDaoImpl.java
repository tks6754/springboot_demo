package com.example.dal.impl;

import com.example.dal.AuthorDao;
import com.example.pojo.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by miaomu on 17-3-21.
 */

@Repository
public class AuthorDaoImpl implements AuthorDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        return jdbcTemplate.update("INSERT INTO t_author(real_name, nick_name) VALUES(?, ?)", author.getNickName(), author.getNickName());
    }

    @Override
    public int update(Author author) {
        return jdbcTemplate.update("DPDATE t_author SET real_name = ?, nick_name = ? WHERE id = ?",
                new Object[]{author.getRealName(), author.getNickName(), author.getId()});
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("DELETE FROM t_author WHERE id = ?", id);
    }

    @Override
    public Author findAuthor(Long id) {
        List<Author> authorList = jdbcTemplate.query("select * from t_author where id = ?",
                new Object[]{id}, new BeanPropertyRowMapper<Author>(Author.class));
        if (null != authorList && authorList.size()>0){
            Author author = authorList.get(0);
            return author;
        }
        return null;
    }

    @Override
    public List<Author> findAuthorList() {
        List<Author> list = jdbcTemplate.query("select * from t_author",
                new Object[]{},
                new BeanPropertyRowMapper<Author>(Author.class));
        return list;
    }
}
