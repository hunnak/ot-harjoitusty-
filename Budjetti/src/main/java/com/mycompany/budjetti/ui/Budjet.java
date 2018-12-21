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

    public Budjet() {
        TimeAndAverage time = new TimeAndAverage();
        Scanner reader = new Scanner(System.in);

        int timePeriodInt;
        while (true) {
            System.out.println("What time period you would like to use?");
            System.out.println("Choose 1kk, 3kk, 6kk, type 1, 3 or 6");
            String timePeriod = reader.nextLine();
            if (timePeriod.equals("1")) {
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            if (timePeriod.equals("3")) {
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            if (timePeriod.equals("6")) {
                timePeriodInt = Integer.parseInt(timePeriod);
                break;
            }
            System.out.println("You typed wrong, type 1, 3 or 6");
        }
        System.out.println("You have choose now lenght of the simulation");
        time.setTotaltime(timePeriodInt);
        int step = 0;
        while (step < timePeriodInt) {
            int stepPlusOne = step + 1;
            System.out.println("Could you add " + stepPlusOne + ". month income, put your salary after taxes");
            String salary = reader.nextLine();
            int salaryInt = Integer.parseInt(salary);
            time.addMoneyFlowOfMonth();
            time.addIncomeToMonth(step, salaryInt);
            System.out.println("Do you have benefits, could you add those together?");
            String benefits = reader.nextLine();
            int benefitsInt = Integer.parseInt(benefits);
            time.addIncomeToMonth(step, benefitsInt);
            System.out.println("Do you already get pension, would you like to add that?");
            String pension = reader.nextLine();
            int pensionInt = Integer.parseInt(pension);
            time.addIncomeToMonth(step, pensionInt);
            System.out.println("Do you do extrawork, would you like to add that?");
            String extraWork = reader.nextLine();
            int extraWorkInt = Integer.parseInt(extraWork);
            time.addIncomeToMonth(step, extraWorkInt);
            System.out.println("Are you an investor ;) , would you like to add that?");
            String dividend = reader.nextLine();
            int dividendInt = Integer.parseInt(dividend);
            time.addIncomeToMonth(step, dividendInt);
            System.out.println("HEY did you do some kind of sidebussiness, would you like to add that?");
            String sideBussiness = reader.nextLine();
            int sideBussinessInt = Integer.parseInt(sideBussiness);
            time.addIncomeToMonth(step, sideBussinessInt);
            System.out.println("Did you were lucky!? ...cmon please add the amount");
            String luckyboy = reader.nextLine();
            int luckyboyInt = Integer.parseInt(luckyboy);
            time.addIncomeToMonth(step, luckyboyInt);
            System.out.println("Well well, how about your spends?");
            System.out.println("How much you pay for your rent?");
            String rent = reader.nextLine();
            int rentInt = Integer.parseInt(rent);
            time.addSpendToMonth(step, rentInt);
            System.out.println("How much you pay for your insurances?");
            String insurance = reader.nextLine();
            int insuranceInt = Integer.parseInt(insurance);
            time.addSpendToMonth(step, insuranceInt);
            System.out.println("How much you pay for your car every month?");
            String car = reader.nextLine();
            int carInt = Integer.parseInt(car);
            time.addSpendToMonth(step, carInt);
            System.out.println("How much you pay off your loans in month?");
            String loan = reader.nextLine();
            int loanInt = Integer.parseInt(loan);
            time.addSpendToMonth(step, loanInt);
            System.out.println("How much you pay for your student oraganization fees?");
            String stuOrg = reader.nextLine();
            int stuOrgInt = Integer.parseInt(stuOrg);
            time.addSpendToMonth(step, stuOrgInt);
            System.out.println("How much you pay for your hobbies (ex. gym partnership)?");
            String hobby = reader.nextLine();
            int hobbyInt = Integer.parseInt(hobby);
            time.addSpendToMonth(step, hobbyInt);
            System.out.println("How much you pay for public transportation?");
            String pubTrans = reader.nextLine();
            int pubTransInt = Integer.parseInt(pubTrans);
            time.addSpendToMonth(step, pubTransInt);
            System.out.println("How much you pay at least mininum for your hygienia?");
            String hygienia = reader.nextLine();
            int hygInt = Integer.parseInt(hygienia);
            time.addSpendToMonth(step, hygInt);
            System.out.println("How much you pay for your food in mininum in month?");
            String food = reader.nextLine();
            int foodInt = Integer.parseInt(food);
            time.addSpendToMonth(step, foodInt);
            System.out.println("Did you were unlucky and had to for something unexpected?");
            String unlucky = reader.nextLine();
            int unluckyInt = Integer.parseInt(unlucky);
            time.addSpendToMonth(step, unluckyInt);

            System.out.println("Temporary UI test (Total income of the month)" + time.getIncomeOfMonth(step));
            System.out.println("State of this month budjet would be " + time.stateOfMonth(step));
            step++;
        }

        System.out.println("Total Income of this simulation " + time.getSimulationTotalIncome());
        System.out.println("Total spends of this simulation " + time.getSimulationTotalSpends());
        int AverageBudjetOfMonth = (time.getSimulationAverageIncome() - time.getSimulationAverageSpends());
        System.out.println("Average month value of your budjet " + AverageBudjetOfMonth);
        System.out.println("Total budjet for this simulation was " + time.budjetStatus());

    }

}
