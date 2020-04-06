/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapService.SOAP;

import java.util.Comparator;

/**
 *
 * @author Data
 */
public class Comparators {

        /**
     * Comparator for filed "id".

     */

     public static Comparator<IPerson> id = new Comparator<IPerson>() {

        @Override
        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return (int) (p1.getId()-p2.getId());
        }
    };

      /**
     * Comparator for filed "firstName".

     */
     public static Comparator<IPerson> firstName = new Comparator<IPerson>() {

        @Override
        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    };

      /**
     * Comparator for filed "lastName".

     */

      public static Comparator<IPerson> lastName = new Comparator<IPerson>() {

        @Override
        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;
            return p1.getLastName().compareTo(p2.getLastName());
        }
    };

        /**
     * Comparator for filed "name".

     */
 /*       public static Comparator<IPerson> name = new Comparator<IPerson>() {



        @Override
        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getName().compareTo(p2.getName());
        }
    };*/
/**
     * Comparator for filed "birthdate".

     */
         public static Comparator<IPerson> birthdate = new Comparator<IPerson>() {

        @Override
        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getBirthdate().compareTo(p2.getBirthdate());
        }
    };
        /**
     * Comparator for filed "gender".

     */

             public static Comparator<IPerson> gender = new Comparator<IPerson>() {

        @Override

        public int compare(IPerson p1, IPerson p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getGender().compareTo(p2.getGender());
        }
    };
             /**
     * Comparator for filed "salary".

     */
                   public static Comparator<IPerson> salary = new Comparator<IPerson>() {

        @Override
        public int compare(IPerson p1, IPerson p2) {
             if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;



            return p1.getSalary().compareTo(p2.getSalary());
        }
    };

}
