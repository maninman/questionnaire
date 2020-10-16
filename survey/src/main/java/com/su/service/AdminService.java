package com.su.service;


import com.su.entity.Admin;
import com.su.mapper.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public int create(Admin admin){
        return adminDao.create(admin);
    }
    public int delete(Integer admin_id) {
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("admin_id",admin_id);
        return adminDao.delete(paramMap);
    }
    public int update(Admin admin){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("admin_id",admin.getAdmin_id());
        paramMap.put("updateAdmin_account",admin.getAdmin_account());
        paramMap.put("updateAdmin_passwd",admin.getAdmin_passwd());
        paramMap.put("updateAdmin_name",admin.getAdmin_name());
        paramMap.put("updateAdmin_phone",admin.getAdmin_phone());
        return adminDao.update(paramMap);
    }
    public int query(Admin admin){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("admin_id",admin.getAdmin_id());
        paramMap.put("Admin_account",admin.getAdmin_account());
        paramMap.put("Admin_passwd",admin.getAdmin_passwd());
        paramMap.put("Admin_name",admin.getAdmin_name());
        paramMap.put("Admin_phone",admin.getAdmin_phone());
        return adminDao.query(paramMap);
    }
    public Admin detail(Integer admin_id){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("admin_id",admin_id);
        return adminDao.detail(paramMap);
    }
    //分页
    public int count(Admin admin){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("admin_id",admin.getAdmin_id());
        paramMap.put("Admin_account",admin.getAdmin_account());
        paramMap.put("Admin_passwd",admin.getAdmin_passwd());
        paramMap.put("Admin_name",admin.getAdmin_name());
        paramMap.put("Admin_phone",admin.getAdmin_phone());
        return adminDao.count(paramMap);
    }
}
