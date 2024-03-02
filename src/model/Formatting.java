/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author trqnbao
 */
public class Formatting {

    public static boolean Matcher(String format, String content) {
        Pattern pattern = Pattern.compile(format);
        Matcher matcher = pattern.matcher(content);        
        return matcher.matches();
    }
}
