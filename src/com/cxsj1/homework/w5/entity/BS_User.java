package com.cxsj1.homework.w5.entity;

public class BS_User {
    private String ID;
    private String Nickname;
    private String Password;
    private String Sex;
    private String Birthday;
    private String Idenity_Code;
    private String Email;
    private String Phone;
    private String Address;
    private int Status;

    public BS_User(String id, String nickname, String password, String sex, String birthday,
                   String idenity_Code, String email, String phone, String address, int status) {
        super();
        ID = id;
        Nickname = nickname;
        Password = password;
        Sex = sex;
        Birthday = birthday;
        Idenity_Code = idenity_Code;
        Email = email;
        Phone = phone;
        Address = address;
        Status = status;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        ID = id;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getIdenity_Code() {
        return Idenity_Code;
    }

    public void setIdenity_Code(String idenity_Code) {
        Idenity_Code = idenity_Code;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
