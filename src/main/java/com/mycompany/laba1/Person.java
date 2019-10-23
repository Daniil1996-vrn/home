/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;


import java.time.Month;
import java.time.temporal.ChronoUnit;

import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.Years;
import java.time.temporal.Temporal;
/**
 *
 * @author Data
 */
public class Person {
    private int id;
    private String NFS;
    private DateTime date;
    private String sex;

    public DateTime getDate() {
        return date;
    }

    public String getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getNFS() {
        return NFS;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNFS(String NFS) {
        this.NFS = NFS;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    

    public Person(int id, String NFS, DateTime date, String sex) {
        this.id = id;
        this.NFS = NFS;
        this.date = date;
        this.sex = sex;
    }
    
    public void difference_date()
    {
        DateTime now = DateTime.now();
/*Period period = new Period( now, date);
System.out.println( "period: " + period );*/

//Interval interval = new Interval(oldTime, new Instant());
        
    Period p = new Period(date, now);
    long hours = p.getHours();
    long minutes = p.getMinutes();
    long years=p.getYears();
    
    System.out.println("Age:"+years+"\n");

    }
    
}
