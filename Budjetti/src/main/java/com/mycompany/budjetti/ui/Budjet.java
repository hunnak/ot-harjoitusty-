/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budjetti.ui;

import com.mycompany.budjetti.logic.TimeAndAverage;
import java.util.Scanner;

/**
 *
 * @author joelhunn
 */
public class Budjet {
    
    public Budjet(){
        TimeAndAverage time = new TimeAndAverage();
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
        System.out.println("You have choose now lenght of the simulation");
        time.setTotaltime(timePeriodInt);
        int step=0;
        while(step<timePeriodInt){
            System.out.println("Lets start from income");
            System.out.println("put your salary after taxes");
            String salary= reader.nextLine();
            int salaryInt = Integer.parseInt(salary);
            time.addMoneyFlowOfMonth();
            
            time.addIncomeToMonth(step,salaryInt );
            System.out.println("Temporary UI test " + time.getIncomeOfMonth(step));
            
            
            
            
            
            
            
            
            step++;
        }
        System.out.println("Temporary UI test total Income " + time.getSimulationTotalIncome());
        
        
        
    }
    
}
