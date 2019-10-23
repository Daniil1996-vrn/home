/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import org.joda.time.DateTime;

/**
 *
 * @author Data
 */
public class Container {
    private int size;

    public Container(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
    
    
    public Person[] create_and_initialize()
    {
        int len=getSize();
        Person[] mass=new Person[size];
        DateTime   date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        for(int i=0;i<len;i++)
        {
            mass[i]=new Person(i, "Petrov", date, "man");
        }
        return mass;
    }
    
    public void show(Person [] mass2)
    {
        System.out.println("Show elements massiv:");
        for(int i=0;i<mass2.length;i++)
        {
            System.out.println("Id:"+mass2[i].getId()+"\n"+"NFS:"+mass2[i].getNFS()+"\n"+"Date:"+mass2[i].getDate()+"\n"+"Sex:"+mass2[i].getSex()+"\n");
        }
    }
    
    public void getelement(Person [] mass2,int index)
    {
       
        System.out.println("Get element for index:"+index);
            System.out.println("Id:"+mass2[index].getId()+"\n"+"NFS:"+mass2[index].getNFS()+"\n"+"Date:"+mass2[index].getDate()+"\n"+"Sex:"+mass2[index].getSex()+"\n");
        
    }
    
    public void delete_element(int index)
    {
        Person [] mass2=create_and_initialize();
        Person [] mass3=new Person[create_and_initialize().length-1];
        
       /* for(int i=0;i<mass2.length;i++)
        {
           //for(int j=0;j<mass3.length;j++)
        //{
            if(i!=index) 
            {
               for(int j=0;j<mass3.length;j++)
        {
            mass3[j]=mass2[i];
        }
               
            }
          
                
            
            
       // }
            
        }*/
        
       //System.arraycopy(mass2, index + 1, mass2, index, mass2.length -(index+1));
        System.arraycopy(mass2, 0, mass3, 0, index );
    System.arraycopy(mass2, index+1, mass3, index, mass2.length - index-1);
        System.out.println("Massiv without element with index:"+index);
        show(mass3);
    }
}
