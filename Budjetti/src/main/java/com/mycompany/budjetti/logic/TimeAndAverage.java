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
    private ArrayList<Income> allIncomes;
    private ArrayList<FixedSpends> allFixspends;
    public TimeAndAverage(){
        this.allIncomes = new ArrayList<Income>();
        this.allFixspends = new ArrayList<FixedSpends>(); 
    }
    public void setTotaltime(int x){
        this.totaltime=x;
    }
    public int getTotalTime(){
        return this.totaltime;
    }
    public void addIncomeMonth(){
        Income income = new Income();
        this.allIncomes.add(income);
    }
    
    
    
}
