package com.mycompany.budjetti.logic;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joelhunn
 */
public class TimeAndAverage {
    
    private int totaltime;
    private ArrayList<MoneyFlow> allMoneyThatFlows;
    public TimeAndAverage(){
        this.allMoneyThatFlows = new ArrayList<MoneyFlow>();
    }
    public void setTotaltime(int x){
        this.totaltime=x;
    }
    public int getTotalTime(){
        return this.totaltime;
    }
    public void addMoneyFlowOfMonth(){
        MoneyFlow flow = new MoneyFlow();
        flow.setTotalIncome(0);
        flow.setTotalSpends(0);
        this.allMoneyThatFlows.add(flow);
    }
    public void addIncomeToMonth(int month,int income){
        this.allMoneyThatFlows.get(month).addIncome(income);
    }
    public int getIncomeOfMonth(int month){
        return this.allMoneyThatFlows.get(month).getIncome();
    }
    public int getSimulationTotalIncome(){
        int totalIncome=0;
        for (int i = 0; i < this.totaltime; i++){
            totalIncome=totalIncome+this.allMoneyThatFlows.get(i).getIncome();
        }
        return totalIncome;
    }
    public void addSpendToMonth(int month,int spend){
        this.allMoneyThatFlows.get(month).addSpend(spend);
    }
    public int getSpendsOfMonth(int month){
        return this.allMoneyThatFlows.get(month).getSpends();
    }
    public int getSimulationTotalSpends(){
        int totalIncome=0;
        for (int i = 0; i < this.totaltime; i++){
            totalIncome=totalIncome+this.allMoneyThatFlows.get(i).getSpends();
        }
        return totalIncome;
    }
    
   
    
    
    
}
