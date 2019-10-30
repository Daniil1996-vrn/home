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
    public static void main(String[] args) throws Exception {
        final int size = 5;
        final int indexGet = 2;
        final int indexDelete = 0;
        final int year = 1965;
        final int month = 7;
        final int day = 22;
        final int unit_time = 0;

        // System.out.println("Hello World");
        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        System.out.println("Age:" + p1.differenceDate());
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrov V.V", date3, "man");
        Person p4 = new Person(0, "Simonov V.V", date, "man");
        Person p5 = new Person(6, "Petrov V.V", date, "man");
        Person p6 = new Person(7, "Petrov V.V", date, "man");

        Container c = new Container(size);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);
        c.add(p6);
        System.out.println("Get element for index 0:\n" + c.getelement(0));
        // c.add(0, "Petrov V.V", date, "man");
        // c.add(1, "Petrov V.V", date, "man");

        c.show();
        //  c.deleteElement(1);
        // c.show();

        System.out.println("Result for search:");
        Person[] search = c.searchByParam("Petrov V.V", 2);
        for (int i = 0; i < search.length; i++) {
            System.out.println("Id:" + search[i].getId() + "\n" + "NFS:" + search[i].getNFS() + "\n" + "Date:"
                    + search[i].getDate() + "\n" + "Sex:" + search[i].getSex() + "\n");
        }

        System.out.println("Sort by bubble:");

        Person[] bubblesort = c.bubbleSort(3);

        for (int i = 0; i < bubblesort.length; i++) {
            System.out.println("Id:" + bubblesort[i].getId() + "\n" + "NFS:" + bubblesort[i].getNFS() + "\n"
                    + "Date:" + bubblesort[i].getDate() + "\n" + "Sex:" + bubblesort[i].getSex() + "\n");
        }

        System.out.println("Sort by insertion:");

        Person[] insertionsort = c.insertionSort(3);

        for (int i = 0; i < insertionsort.length; i++) {
            System.out.println("Id:" + insertionsort[i].getId() + "\n" + "NFS:" + insertionsort[i].getNFS() + "\n"
                    + "Date:" + insertionsort[i].getDate() + "\n" + "Sex:" + insertionsort[i].getSex() + "\n");
        }
        /*c.getelement(c.create_and_initialize(), indexGet);
       c.delete_element(indexDelete);*/
    }
}
