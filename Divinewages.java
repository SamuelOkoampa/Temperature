/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.divinewages;

/**
 *
 * @author ks
 */
public class Divinewages {

    public static void main(String[] args) {
        String myRegularWages= "Regular Wages:";
        float Regular=50;
        String myBasepay = "basePay = 25;";
        String myRegular ="Regular hours = 40";
        float myOvertime = 37.5f;
        int myOverPay = 35;
        int myOverHours =10;
        float myTotalWages= Regular + myOvertime;
        
        
        System.out.println(myRegularWages +" "+ Regular);
        
        System.out.println(myBasepay);
        System.out.println(myRegular);
        System.out.println("OverTime Wages =" +" " +myOvertime);
        System.out.println("OverTime Pay =" +" "+ myOverPay);
        System.out.println("Overtime Hours =" + " "+ myOverHours);
        System.out.println("Total Wages = " +" " + myTotalWages);
      
    }
}
