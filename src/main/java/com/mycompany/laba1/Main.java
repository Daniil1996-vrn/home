/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import org.joda.time.DateTime;

/**
 *
 * @author Data
 */
public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello World");
     DateTime   date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
       Person p=new Person(0, "Petrov V.V", date, "man");
       p.difference_date();
       Container c=new Container(5);
       c.create_and_initialize();
       c.show( c.create_and_initialize());
       c.getelement( c.create_and_initialize(),2);
       c.delete_element(0);
    } 
    
}
