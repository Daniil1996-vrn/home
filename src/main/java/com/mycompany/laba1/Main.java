/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import org.joda.time.DateTime;

/**
 *Class Main is the main class of this program.
 * Here: :
 * 1) Create and initialize Object date of class DateTime;
 * 2) Create and initialize Object p of class Person;
 * 3) Call method difference_date() of class Person;
 * 4) Create and initialize Object с of class Container;
 * 5) Call method show of class Container;
 * 6) Call method getelement of class Container;
 * 7) Call method delete_element of class Container;
 *
 *
 * @author Data
 */


public class Main {

    /**This is constructor.
 */
    public Main() {
    }
/**In method "Msin" create adnd initialize objects and call methods.
 */
    public static void main(String[] args) {
        final int size = 5;
        final int indexGet = 2;
        final int indexDelete = 0;
        final int year = 1965;
        final  int month = 7;
        final int day = 22;
        final int unit_time = 0;

       // System.out.println("Hello World");
     DateTime   date = new DateTime(year, month, day, unit_time,
             unit_time, unit_time, unit_time);
       Person p = new Person(0, "Petrov V.V", date, "man");
       p.differenceDate();
        Person p2 = new Person(1, "Petrov V.V", date, "man");

       Container c = new Container(size);
       c.add(p);
       c.add(p2);
      // c.add(0, "Petrov V.V", date, "man");
        // c.add(1, "Petrov V.V", date, "man");

      c.show();
       /*c.getelement(c.create_and_initialize(), indexGet);
       c.delete_element(indexDelete);*/
}
 }
