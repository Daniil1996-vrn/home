/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
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
public class RepositoryTest {

    public RepositoryTest() {
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
     * Test of add method, of class Repository.
     */
    @Test
    public void testAdd_IPerson() {

        IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);
        Person p4 = new Person(7, "Valeriy", "Petrov", Gender.MALE, localDate2, div, bd);
        Person p5 = new Person(8, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        IPerson[] result={p1,p2,p3,p4,p5};


         Repository c = new Repository(1);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);

      IPerson[]  expresult=c.getMass();

       assertEquals(expresult, result);


      //  Repository instance = null;
       // instance.add(person);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class Repository.
     */
    @Test
    public void testAdd_int_IPerson() {
        System.out.println("add");
        int index = 0;

          IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);


        IPerson person = p3;
        Repository instance = new Repository(1);

        instance.add(p1);
        instance.add(p2);

        instance.add(index, p3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class Repository.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        IPerson person = null;
        Repository instance = new Repository(1);

         IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);


        IPerson expResult = p3;
        IPerson result = instance.set(index, p3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Repository.
     */
    @Test
    public void testGet() {
        System.out.println("get");

          IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        int index = 1;
      Repository instance = new Repository(1);
      instance.add(p1);
       instance.add(p2);

        IPerson expResult = p2;
        IPerson result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toList method, of class Repository.
     */
    @Test
    public void testToList() {
        System.out.println("toList");

        IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);


        Repository instance = new Repository(1);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);

        List<IPerson> expResult = new ArrayList<>();
        expResult.add(p1);
         expResult.add(p2);
          expResult.add(p3);
        List<IPerson> result = instance.toList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Repository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int index = 0;

        IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);
        Person p4 = new Person(7, "Valeriy", "Petrov", Gender.MALE, localDate2, div, bd);
        Person p5 = new Person(8, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);
        Person p6 = new Person(9, "Vera", "Petrova", Gender.FEMALE, localDate1, div3, bd2);
        Person p7 = new Person(10, "Ivan", "Ivanov", Gender.MALE, localDate3, div, bd);
        Person p8 = new Person(0, "Vladimir", "Smirnov", Gender.MALE, localDate1, div, bd3);

        Repository c = new Repository(2);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);
        c.add(p6);
        c.add(p7);
        c.add(p8);



        IPerson[] expResult = {p2,p3,p4,p5,p6,p7,p8};
        c.delete(index);
        IPerson[] result =c.getMass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMass method, of class Repository.
     */
    @Test
    public void testGetMass() {
        System.out.println("getMass");

          IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);


        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate1, div, bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE, localDate1, div2, bd);



        Repository instance = new Repository(1);
        IPerson[] expResult = {p1,p2,p3};

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);


        IPerson[] result = instance.getMass();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of sortBy method, of class Repository.
     */
    @Test
    public void testSortBy() {
        System.out.println("sortBy");
        Comparator<IPerson> comparator = Comparators.id;
        Repository instance = new Repository(1);
        instance.sortBy(comparator);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }





    /**
     * Test of searchBy method, of class Repository.
     */
    @Test
    public void testSearchBy() {
        System.out.println("searchBy");

         Predicates pred = new Predicates();

        Predicate<IPerson> condition = pred.firstNameField;





         IRepository buf = new Repository(1);

         IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        IPerson p1 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate1,  div, bd);

        IPerson p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate1,  div, bd);

        IPerson p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate1,  div2, bd);
        IPerson p4 = new Person(7, "Valeriy", "Petrov",  Gender.MALE,localDate2, div, bd);
        IPerson p5 = new Person(8, "Valeriy", "Petrov", Gender.MALE,localDate1,  div, bd);
        IPerson p6 = new Person(9, "Vera", "Petrova",Gender.FEMALE, localDate1,  div3, bd2);
        IPerson p7 = new Person(10, "Ivan", "Ivanov", Gender.MALE,localDate3,  div, bd);
        IPerson p8 = new Person(0, "Vladimir", "Smirnov",Gender.MALE, localDate1,  div, bd3);

        buf.add(p1);
        buf.add(p2);
        buf.add(p3);
        buf.add(p4);



        IRepository expResult = buf;
        IRepository result = buf.searchBy(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}
