/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author trqnbao
 */
public class UserList {
    ArrayList<User> list;

    public UserList() {
        list = new ArrayList<>();
    }
    
    public UserList(ArrayList<User> list)
    {
        this.list = list;
    }
    
    public void insert(User u)
    {
        list.add(u);
    }
    
    public void delete(User u)
    {
        list.remove(u);
    }
    
    public void update(User u)
    {
        for(User i : list)
        {
            if (i.getUserId().equals(u.getUserId()))
            {
                i = u;
            }
        }
    }
    
    public void sort()
    {
    }
    
    public boolean isUsernameExisted(String username)
    {
        
        for(User i : list)
        {
            if (i.getFullName().equalsIgnoreCase(username)) return true;
        }
        return false;
    }
    
    public boolean isUsernameAndPasswordMatches(String username, String password)
    {
        for(User i : list)
        {
            if (i.getUserName().equalsIgnoreCase(username)&&i.getPassword().equalsIgnoreCase(password)) return true;
        }
        return false;
    }
    
    public User getUserByUserNameAndPassword(String username, String password)
    {
        for(User i : list)
        {
            if (i.getFullName().equalsIgnoreCase(username)&&i.getPassword().equalsIgnoreCase(password)) return i;
        }
        return null;
    }

    public void generateString()
    {
        
    }
    public void userGenerate(int quantity)
    {
        for(int i = 0; i < quantity ; i++)
        {
           
        }
    }
}
