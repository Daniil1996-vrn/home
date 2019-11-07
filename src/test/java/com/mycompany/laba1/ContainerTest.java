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

        DateTime date1 = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date1, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrova V.V", date3, "women");


        Container instance = new Container(3);

        instance.add(p1);
         instance.add(p2);
          instance.add(p3);

         Container instance2 = new Container(3);

           instance2.add(p1);
         instance2.add(p2);
          instance2.add(p3);



        // Person[] expResult = {p1};

        assertArrayEquals(instance.getMass(), instance2.getMass());

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
    public void testDeleteElement() throws Exception {
        System.out.println("deleteElement");
        int index = 0;

        int expResult=2;

        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrov V.V", date3, "man");




        Container instance = new Container(3);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);

      int result=  instance.deleteElement(index).length;
        System.out.println(result);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of searchByParam method, of class Container.
     */
    @org.junit.Test
    public void testSearchByParam() throws Exception {

        //search by param:1-field id

        System.out.println("searchByParam");
        String value = "1";
        int numberParam = 1;


        DateTime date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1 = new Person(1, "Petrov V.V", date, "man");
        Person p2 = new Person(4, "Ivanov V.V", date2, "man");
        Person p3 = new Person(5, "Petrova V.V", date3, "women");


        Container instance = new Container(3);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);



       // Container instance = null;
        Person[] expResult = {p1};
        Person[] result = instance.searchByParam(value, numberParam);
        assertArrayEquals(expResult, result);


        //search by param:2-field NFS

        System.out.println("searchByParam");
        String value2 = "Ivanov V.V";
        int numberParam2 = 2;


        DateTime date1 = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date22 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date33 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p11 = new Person(1, "Petrov V.V", date1, "man");
        Person p22 = new Person(4, "Ivanov V.V", date22, "man");
        Person p33 = new Person(5, "Petrova V.V", date33, "women");


        Container instance2 = new Container(3);

        instance2.add(p11);
        instance2.add(p22);
        instance2.add(p33);



       // Container instance = null;
        Person[] expResult2 = {p22};
        Person[] result2 = instance2.searchByParam(value2, numberParam2);
        assertArrayEquals(expResult2, result2);

          //search by param:3-field date

        System.out.println("searchByParam");
        String value3 = "22/7/1970 0:0:0";
        int numberParam3 = 3;


        DateTime date11 = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date222 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date333 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p111 = new Person(1, "Petrov V.V", date11, "man");
        Person p222 = new Person(4, "Ivanov V.V", date222, "man");
        Person p333 = new Person(5, "Petrova V.V", date333, "women");


        Container instance3 = new Container(3);

        instance3.add(p111);
        instance3.add(p222);
        instance3.add(p333);



       // Container instance = null;
        Person[] expResult3 = {p333};
        Person[] result3 = instance2.searchByParam(value3, numberParam3);
        assertArrayEquals(expResult3, result3);

         //search by param:4-field sex

        System.out.println("searchByParam");
        String value4 = "man";
        int numberParam4 = 4;


        DateTime date111 = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date2222 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date3333 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p1111 = new Person(1, "Petrov V.V", date11, "man");
        Person p2222 = new Person(4, "Ivanov V.V", date2222, "man");
        Person p3333 = new Person(5, "Petrova V.V", date3333, "women");


        Container instance4 = new Container(3);

        instance4.add(p1111);
        instance4.add(p2222);
        instance4.add(p3333);



       // Container instance = null;
        Person[] expResult4 = {p1111,p2222};
        Person[] result4 = instance2.searchByParam(value4, numberParam4);
        assertArrayEquals(expResult4, result4);

        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class Container.
     */
    @org.junit.Test
    public void testBubbleSort() throws Exception {

        // test for param:1-field ID
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


      //  Person [] arr={p4,p1,p2,p3,p5};
        Container instance = new Container(5);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);
        instance.add(p4);
        instance.add(p5);

        Person[] expResult = {p4,p1,p2,p3,p5};
        Person[] result = instance.bubbleSort(numberParam);
        assertArrayEquals(expResult, result);


        // test for param:3-field Date
        System.out.println("bubbleSort");

        int numberParam2= 3;

        DateTime date1 = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        DateTime date22 = new DateTime(1960, 7, 22, 0, 0, 0, 0);
        DateTime date33 = new DateTime(1970, 7, 22, 0, 0, 0, 0);

        Person p11 = new Person(1, "Petrov V.V", date, "man");
        Person p22 = new Person(4, "Ivanov V.V", date2, "man");
        Person p33 = new Person(5, "Petrov V.V", date3, "man");
        Person p44 = new Person(0, "Simonov V.V", date, "man");
        Person p55 = new Person(6, "Petrov V.V", date, "man");


      //  Person [] arr2={p4,p1,p2,p3,p5};
        Container instance2 = new Container(5);

        instance2.add(p11);
        instance2.add(p22);
        instance2.add(p33);
        instance2.add(p44);
        instance2.add(p55);

        Person[] expResult2 = {p4,p1,p2,p3,p5};
        Person[] result2 = instance.bubbleSort(numberParam);
        assertArrayEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSort method, of class Container.
     */
    @org.junit.Test
    public void testInsertionSort() throws Exception {

        //test by param:1-field ID

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
