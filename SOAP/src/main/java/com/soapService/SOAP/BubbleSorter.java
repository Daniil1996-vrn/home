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
public class BubbleSorter implements ISorter {
      public void sortby(Comparator<IPerson> comparator,IPerson[] mass)  {




        for (int i = 0; i < mass.length; i++) {
                    for (int j = mass.length-1 ; j > i; j--) {
                        if (comparator.compare(mass[j-1], mass[j])>0) {
                            IPerson buf = mass[j - 1];
                            mass[j - 1] = mass[j];
                            mass[j] = buf;
                        }

                    }
                }

    }

}
