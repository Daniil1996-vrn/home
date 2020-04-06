/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
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
public class PersonTest {

    public PersonTest() {
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



    @Test
    public void testGetAge() {

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

        System.out.println("getAge");
        Person instance = p1;
        Integer expResult = 59;
        Integer result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}
