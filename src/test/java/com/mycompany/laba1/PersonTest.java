/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
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



    /**
     * Test of differenceDate method, of class Person.
     */
    @Test
    public void testGetAge() {
        BigDecimal bd = new BigDecimal(20000);
        System.out.println("differenceDate");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        Person instance = new Person(1, "Valeriy", "Petrov", Gender.MALE,localDate1,  "A", bd);
        int expResult = 59;
        int result = instance.getAge();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
