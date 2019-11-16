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
    public void testAdd_Person() {

        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE,localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);

        Repository instance = new Repository(3);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);

        Repository instance2 = new Repository(3);

        instance2.add(p1);
        instance2.add(p2);
        instance2.add(p3);

        assertArrayEquals(instance.getMass(), instance2.getMass());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Repository.
     */
    @Test
    public void testAdd_int_Person() {
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);

        Person p4 = new Person(7, "Valeriy", "Petrov",Gender.MALE, localDate2,  "C", bd);

        Person[] mass2={p1,p2,p3,p4};

        Repository instance = new Repository(4);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);
        instance.add(3,p4);

       assertArrayEquals(mass2,instance.getMass());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class Repository.
     */
    @Test
    public void testSet() {
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE,localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);

        Person p4 = new Person(7, "Valeriy", "Petrov", Gender.MALE,localDate2,  "C", bd);

        Person p5 = new Person(8, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);

        Person[] mass2={p1,p2,p3,p5};

        Repository instance = new Repository(4);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);
         instance.add(p4);
        instance.set(3,p5);

       assertArrayEquals(mass2,instance.getMass());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Repository.
     */
    @Test
    public void testGet() {

         LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);



        Repository instance = new Repository(4);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);


        System.out.println("get");
        int index = 2;
       // Repository instance = null;
        Person expResult = p3;
        Person result = instance.get(index);
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

        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, "A", bd);
       // System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",  Gender.MALE,localDate1, "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);

          Repository instance = new Repository(3);

          instance.add(p1);
        instance.add(p2);
        instance.add(p3);


        List<Person> expResult = new ArrayList<Person>();
        expResult.add(p1);
         expResult.add(p2);
           expResult.add(p3);
        List<Person> result = instance.toList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }



    /**
     * Test of delete method, of class Repository.
     */
    @Test
    public void testDelete() {
       System.out.println("deleteElement");
        int index = 0;

        int expResult=2;

        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);




        Repository instance = new Repository(3);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);

      int result=  instance.delete(index).length;
        System.out.println(result);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMass method, of class Repository.
     */
    @Test
    public void testGetMass() {
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov", Gender.MALE,localDate1,  "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);

        Person[] mass2={p1,p2,p3};


        Repository instance = new Repository(3);

        instance.add(p1);
        instance.add(p2);
        instance.add(p3);

         assertArrayEquals(mass2, instance.getMass());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readFromFileInRepository method, of class Repository.
     */
    @Test
    public void testReadFromFileInRepository() throws Exception {
        System.out.println("readFromFileInRepository");
        String fileName = "C:\\Soft\\test.txt";

         LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate1, "A", bd);
       // System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate2,  "D", bd2);

        Person p3 = new Person(6, "Valeriy", "Petrov",  Gender.MALE,localDate3, "B", bd3);
        //Repository instance = null;
        Person[] expResult = {p1,p2,p3};
        Repository instance=new Repository(3);
        Person[] result = instance.readFromFileInRepository(fileName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sortBy method, of class Repository.
     */
    @Test
    public void testSortBy() {

        //sortBy Id

        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);


        Person p1 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate1,  "A", bd);
       // System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate2,  "D", bd2);

        Person p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate3,  "B", bd3);
        //Repository instance = null;
        Person[] expResult = {p1,p2,p3};
        Repository instance=new Repository(3);


        instance.add(p3);
        instance.add(p1);
        instance.add(p2);


        Comparator<Person> comparator = Repository.id;

        instance.sortBy(comparator);
        Person[] result=instance.getMass();
        assertArrayEquals(expResult, result);

        //sort by salary

        LocalDate localDate11 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate22 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate33 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd11 = new BigDecimal(20000);
        BigDecimal bd22 = new BigDecimal(25000);
        BigDecimal bd33 = new BigDecimal(35000);


        Person p11 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate11,  "A", bd11);
       // System.out.println("Age:" + p1.getAge());

        Person p22 = new Person(5, "Valeriy", "Petrov", Gender.MALE,localDate22,  "D", bd22);

        Person p33 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate33,  "B", bd33);
        //Repository instance = null;
        Person[] expResult2 = {p11,p22,p33};
        Repository instance2=new Repository(3);


        instance2.add(p33);
        instance2.add(p11);
        instance2.add(p22);


        Comparator<Person> comparator2 = Repository.salary;

        instance2.sortBy(comparator2);
        Person[] result2=instance2.getMass();
        assertArrayEquals(expResult2, result2);

        //sort by birthdate

        LocalDate localDate111 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate222 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate333 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd111 = new BigDecimal(20000);
        BigDecimal bd222 = new BigDecimal(25000);
        BigDecimal bd333 = new BigDecimal(35000);


        Person p111 = new Person(1, "Valeriy", "Petrov", Gender.MALE, localDate111, "A", bd111);
       // System.out.println("Age:" + p1.getAge());

        Person p222 = new Person(5, "Valeriy", "Petrov", Gender.MALE, localDate222, "D", bd222);

        Person p333 = new Person(6, "Valeriy", "Petrov", Gender.MALE,localDate333,  "B", bd333);
        //Repository instance = null;
        Person[] expResult3 = {p111,p222,p333};
        Repository instance3=new Repository(3);


        instance3.add(p333);
        instance3.add(p111);
        instance3.add(p222);


        Comparator<Person> comparator3 = Repository.salary;

        instance3.sortBy(comparator3);
        Person[] result3=instance3.getMass();
        assertArrayEquals(expResult3, result3);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchBy method, of class Repository.
     */
    @Test
    public void testSearchBy() {
        System.out.println("searchBy");
        Predicate<Person> condition = null;
        Repository instance = null;
        IRepository expResult = null;
        IRepository result = instance.searchBy(condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
