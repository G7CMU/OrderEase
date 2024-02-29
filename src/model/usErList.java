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
public class usErList {
    ArrayList<user> list;

    public usErList() {
        list = new ArrayList<>();
    }
    
    public usErList(ArrayList<user> list)
    {
        this.list = list;
    }
    
    public void insert(user u)
    {
        list.add(u);
    }
    
    public void delete(user u)
    {
        list.remove(u);
    }
    
    public void update(user u)
    {
        for(user i : list)
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
        
        for(user i : list)
        {
            if (i.getFullName().equalsIgnoreCase(username)) return true;
        }
        return false;
    }
    
    public boolean isUsernameAndPasswordMatches(String username, String password)
    {
        for(user i : list)
        {
            if (i.getFullName().equalsIgnoreCase(username)&&i.getPassword().equalsIgnoreCase(password)) return true;
        }
        return false;
    }
    
    public user getUserByUserNameAndPassword(String username, String password)
    {
        for(user i : list)
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
