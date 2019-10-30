/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Data
 */
public class ContainerTest {

    public ContainerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setSize method, of class Container.
     */


    /**
     * Test of add method, of class Container.
     */
    @org.junit.Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Person obj = null;
        Container instance = null;
        instance.add(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class Container.
     */
    @org.junit.Test
    public void testShow() {
        System.out.println("show");
        Container instance = null;
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getelement method, of class Container.
     */
    @org.junit.Test
    public void testGetelement() throws Exception {
        System.out.println("getelement");

        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrov V.V", date3, "man");




        Container instance = new Container(5);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);



        int index = 0;

        String expResult = "Id:" + "1" + "\n"
                + "NFS:" + "Petrov V.V" + "\n"
                + "Date:" + date.toString() + "\n" + "Sex:"
                + "man" + "\n";
        String result = instance.getelement(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteElement method, of class Container.
     */
    @org.junit.Test
    public void testDeleteElement() {
        System.out.println("deleteElement");
        int index = 0;
        Container instance = null;
        instance.deleteElement(index);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of searchByParam method, of class Container.
     */
    @org.junit.Test
    public void testSearchByParam() throws Exception {
        System.out.println("searchByParam");
        String value = "";
        int numberParam = 0;
        Container instance = null;
        Person[] expResult = null;
        Person[] result = instance.searchByParam(value, numberParam);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class Container.
     */
    @org.junit.Test
    public void testBubbleSort() throws Exception {
        System.out.println("bubbleSort");
        int numberParam = 1;

        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrov V.V", date3, "man");
        Person p4 = new Person(0, "Simonov V.V", date, "man");
        Person p5 = new Person(6, "Petrov V.V", date, "man");


        Person [] arr={p4,p1,p2,p3,p5};
        Container instance = new Container(5);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);
        instance.add(p4);
        instance.add(p5);

        Person[] expResult = {p4,p1,p2,p3,p5};
        Person[] result = instance.bubbleSort(numberParam);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSort method, of class Container.
     */
    @org.junit.Test
    public void testInsertionSort() throws Exception {
        System.out.println("insertionSort");
        int numberParam = 1;

        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrov V.V", date3, "man");
        Person p4 = new Person(0, "Simonov V.V", date, "man");
        Person p5 = new Person(6, "Petrov V.V", date, "man");


        Person [] arr={p4,p1,p2,p3,p5};
        Container instance = new Container(5);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);
        instance.add(p4);
        instance.add(p5);

        Person[] expResult = {p4,p1,p2,p3,p5};
        Person[] result = instance.insertionSort(numberParam);
        assertArrayEquals(expResult, result);
    }

}
