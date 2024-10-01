package org.sahitya.learning;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name ="";

        System.out.println("Hello world" +Thread.currentThread().getName());



        Human habc = new Human();
        habc.name ="Sahitya";
        habc.age = 9;
        habc.dob=new Date();
        try {
            Thread.sleep(60000);

        }catch (Exception e){

        }
        System.out.println(habc.name);


    }
}
