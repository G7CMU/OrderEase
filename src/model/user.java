/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class user {
    private UUID userId;
    private String userName;
    private String password;
    private String fullName;
    private String location;
    private String email;
    private String phoneNo;
    private Date dateOfBirth;
    
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public user(String userName, String password, String fullName, Boolean gender, String location, String email, String phoneNo, Date dateOfBirth) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.location = location;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
    }
    
    public user() {
        this.userId = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "user{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", fullName=" + fullName + ", location=" + location + ", email=" + email + ", phoneNo=" + phoneNo + '}';
    }
    
    public user generateUser(int num)
    {
        user temp = new user();
        Random rd = new Random();
        temp.setFullName("user" + num);
        temp.setPassword(num + "" + num + num + num);
        temp.setUserName("user" + num + num);
        return temp;
    }
}
