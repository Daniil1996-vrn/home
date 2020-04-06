/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Stream;
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
public class LoadRepositoryTest {

    public LoadRepositoryTest() {
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
     * Test of getR method, of class LoadRepository.
     */


    /**
     * Test of readFromFileInRepository method, of class LoadRepository.
     */
    @Test
    public void testReadFromFileInRepository() throws Exception {
        System.out.println("readFromFileInRepository");
        String fileName = "C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.csv";
        LoadRepository instance = new LoadRepository();
        instance.readFromFileInRepository(fileName);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of threeMethod method, of class LoadRepository.
     */
    @Test
    public void testThreeMethod() throws Exception {

        System.out.println("threeMethod");
        String fileName = "C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.csv";
        LoadRepository instance = new LoadRepository();
        instance.readFromFileInRepository(fileName);
        Stream<IPerson> expResult = instance.getR().toList().stream().filter(s -> s.getFirstName().contains("aa"));
        Stream<IPerson> result = instance.threeMethod();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of twoMethod method, of class LoadRepository.
     */
    @Test
    public void testTwoMethod() {
        System.out.println("twoMethod");
        LoadRepository instance = new LoadRepository();
        Stream<IPerson> expResult = null;
        Stream<IPerson> result = instance.twoMethod();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fourMethod method, of class LoadRepository.
     */
    @Test
    public void testFourMethod() {
        System.out.println("fourMethod");
        LoadRepository instance = new LoadRepository();
        Map<Integer, Long> expResult = null;
        Map<Integer, Long> result = instance.fourMethod();
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of oneMethod method, of class LoadRepository.
     */
    @Test
    public void testOneMethod() {
        System.out.println("oneMethod");
        LoadRepository instance = new LoadRepository();
        Map<String, BigDecimal> expResult = null;
        Map<String, BigDecimal> result = instance.oneMethod();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

}
