/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
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
public class BubbleSorterTest {

    public BubbleSorterTest() {
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
     * Test of bubbleSort method, of class BubbleSorter.
     */
    @Test
    public void testBubbleSort() throws Exception {
        System.out.println("bubbleSort");
        Comparator<IPerson> comparator = Comparators.id;
        BubbleSorter instance = new BubbleSorter();

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

        c.sortBy(comparator);

        IPerson[] expResult = {p8,p1,p2,p3,p4,p5,p6,p7};
        IPerson[] result = c.getMass();
        assertEquals(expResult, result);


    }

}
