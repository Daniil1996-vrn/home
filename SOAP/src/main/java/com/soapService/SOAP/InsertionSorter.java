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
public class InsertionSorter implements ISorter {

    public void sortby(Comparator<IPerson> comparator,IPerson[] mass) {



        IPerson temp;
        int item;
        for (int counter = 1; counter < mass.length; counter++) {
            temp = mass[counter];
            item = counter - 1;
            while (item >= 0 && comparator.compare(mass[item], temp) > 0) {
                mass[item + 1] = mass[item];
                mass[item] = temp;
                item--;
            }
        }

    }

}
