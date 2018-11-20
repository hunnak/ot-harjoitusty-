package com.mycompany.budjetti;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joelhunn
 */
public class BudjetMain {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        int timePeriodInt;
        while(true){
            System.out.println("What time period you would like to use?");
            System.out.println("Choose 1kk, 3kk, 6kk, type 1, 3 or 6");
            String timePeriod = reader.nextLine();
            if(timePeriod.equals("1")){
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            if(timePeriod.equals("3")){
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            if(timePeriod.equals("6")){
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            System.out.println("You typed wrong, type 1, 3 or 6");
        }
    }    
}
    
    

