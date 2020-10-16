package com.su.entity;

public class Admin {
    private Integer admin_id;
    private String admin_account;
    private String admin_passwd;
    private String admin_phone;
    private String admin_name;

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_passwd() {
        return admin_passwd;
    }

    public void setAdmin_passwd(String admin_passwd) {
        this.admin_passwd = admin_passwd;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }
}
