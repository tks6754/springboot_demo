package com.example.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by miaomu on 17-3-21.
 */
public class Author {
    private Long id;
    @JSONField(name="real_name")
    private String realName;
    @JSONField(name="nick_name")
    private String nickName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
