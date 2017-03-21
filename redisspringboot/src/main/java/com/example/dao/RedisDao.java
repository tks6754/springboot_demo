package com.example.dao;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by miaomu on 17-3-21.
 */

@Repository
public class RedisDao {
    @Resource(name="redisTemplate")
    protected ValueOperations<String, String> valueOperations;

    public void addValue(String key, String value){
        valueOperations.set(key, value);
    }

    public String getValue(String key){
        return valueOperations.get(key);
    }
}
