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
            int stepPlusOne=step+1;
            System.out.println("Could you add " + stepPlusOne + ". month income, put your salary after taxes");
            String salary= reader.nextLine();
            int salaryInt = Integer.parseInt(salary);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,salaryInt );
            System.out.println("Do you have benefits, could you add those together?");
            String benefits= reader.nextLine();
            int benefitsInt = Integer.parseInt(benefits);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,benefitsInt);
            System.out.println("Do you already get pension, would you like to add that?");
            String pension= reader.nextLine();
            int pensionInt = Integer.parseInt(pension);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,pensionInt);
            System.out.println("Do you do extrawork, would you like to add that?");
            String extraWork= reader.nextLine();
            int extraWorkInt = Integer.parseInt(extraWork);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,extraWorkInt);
            System.out.println("Are you an investor ;) , would you like to add that?");
            String dividend= reader.nextLine();
            int dividendInt = Integer.parseInt(dividend);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,dividendInt);
            System.out.println("HEY did you do some kind of sidebussiness, would you like to add that?");
            String sideBussiness= reader.nextLine();
            int sideBussinessInt = Integer.parseInt(sideBussiness);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,sideBussinessInt);
            System.out.println("Did you were lucky!? ...cmon please add the amount");
            String luckyboy= reader.nextLine();
            int luckyboyInt = Integer.parseInt(luckyboy);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step,luckyboyInt);
            
            
            
            
            
            
            
            System.out.println("Temporary UI test (Total income of the month)" + time.getIncomeOfMonth(step));
            step++;
        }
        System.out.println("Temporary UI test total Income " + time.getSimulationTotalIncome());
        
        
        
    }
    
}
