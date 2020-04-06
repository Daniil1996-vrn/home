/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.util.Comparator;

/**
 *
 * @author Data
 */
public interface ISorter {

    void sortby(Comparator<IPerson> comparator,IPerson[] mass);

}
