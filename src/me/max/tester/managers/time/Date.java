/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.max.tester.managers.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Max
 */
public class Date {
    
    public String getDate() { // "dd/MM/yyyy"
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = new java.util.Date();
        return dateFormat.format(date);
    }
    
}
