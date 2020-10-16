package com.su.mapper;

import com.su.entity.Admin;

import java.util.Map;


public interface AdminDao {

    public int create(Admin admin);
    public int delete(Map<String,Object> paramMap);
    public int update(Map<String,Object> paramMap);
    public int query(Map<String,Object> paramMap);
    public Admin detail(Map<String,Object> paramMap);
    //分页
    public int count(Map<String,Object> paramMap);

}
