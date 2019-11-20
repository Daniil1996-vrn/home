/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Data
 */
public class LoadRepository {

    public void readFromFileInRepository(String fileName) throws FileNotFoundException, IOException, Exception
    {
          Repository r =new Repository(2000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(fileName);
        BufferedReader fin = new BufferedReader(new FileReader(f));

        String line;
        Scanner in = new Scanner(new File(fileName));

      // while ((line = fin.readLine()) != null)
    // for(int i=0;i<100;i++)
     while (in.hasNextLine())
        {
            //System.out.println(line);
            String buf=in.nextLine();
            if(buf.startsWith("id"))
            {
                ;
            }
            else
            {
            String [] bufArray=buf.split(";");







                /*mass[j].setId(Integer.parseInt(bufArray[0]));
                mass[j].setFirstName(bufArray[1]);
                mass[j].setLastName(bufArray[2]);
                mass[j].setGender((Gender.valueOf(bufArray[3].toUpperCase())));
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//formatter = formatter.withLocale( putAppropriateLocaleHere );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
LocalDate date = LocalDate.parse(bufArray[4], formatter);
               mass[j].setBirthdate(date);
               mass[j].setName(bufArray[5]);
               BigDecimal money = new BigDecimal(bufArray[6]);
               mass[j].setSalary(money);*/


              int id=  Integer.parseInt(bufArray[0]);
               String firstName= bufArray[1];
               String lastName=bufArray[2];
                Gender gender=Gender.valueOf(bufArray[3].toUpperCase());
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//formatter = formatter.withLocale( putAppropriateLocaleHere );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
                LocalDate date = LocalDate.parse(bufArray[4], formatter);

               String Name=bufArray[5];

              IDivision div =new Division(Name);
            //   div.setName(bufArray[5]);

               BigDecimal money = new BigDecimal(bufArray[6]);


             IPerson bufObject=new Person( id,   firstName, lastName,gender, date,  div, money);

             if(bufObject!=null)
             {
                 r.add(bufObject);
             }


          /*  System.out.println(
                    "Id:"+id+"\n"
                    +"First name:"+firstName+"\n"
                    +"Last name:"+lastName+"\n"
                      +"Gender:"+gender+"\n"
                     +"Birthdate:"+date+"\n"
                    +"Division:"+Name+"\n"
                    +"Salary:"+money+"\n\n"
            );*/


            }




        }
       // return mass;
     //  show();

    }

}
