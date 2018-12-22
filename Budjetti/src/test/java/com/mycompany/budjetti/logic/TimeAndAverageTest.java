/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budjetti.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joelhunn
 */
public class TimeAndAverageTest {
    
    TimeAndAverage timeandavg;
    @Before
    public void setUp() {
        timeandavg= new TimeAndAverage();
    }
    
    @Test
    public void setTotalTimeNgetTotaltimeTest(){
        this.timeandavg.setTotaltime(3);
        assertEquals(3,this.timeandavg.getTotalTime());
    }
    @Test
    public void isThereMonthTest(){
        this.timeandavg.addMoneyFlowOfMonth();
        assertEquals(this.timeandavg.getIncomeOfMonth(0),0);
    }
    @Test
    public void addIncomesTest(){
        int totalIncome=0;
        this.timeandavg.setTotaltime(2);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(0, 500);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(1, 500);
        
        assertEquals(this.timeandavg.getSimulationTotalIncome(),1000);
    }
    @Test
    public void addSpendsTest(){
        this.timeandavg.setTotaltime(2);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(0, 400);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(1, 400);
        
        assertEquals(this.timeandavg.getSimulationTotalSpends(),800);
    }
    @Test
    public void getMonthSpendsTest(){
        this.timeandavg.setTotaltime(1);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(0, 200);
        
        assertEquals(this.timeandavg.getSpendsOfMonth(0), 200);
    }
    @Test
    public void averageIncomeTest(){
        this.timeandavg.setTotaltime(3);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(0, 500);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(1, 1000);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(2, 1500);
        
        assertEquals(this.timeandavg.getSimulationAverageIncome(), 1000);
    }
    @Test
    public void averageSpendsTest(){
        this.timeandavg.setTotaltime(3);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(0, 500);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(1, 1000);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addSpendToMonth(2, 1500);
        
        assertEquals(this.timeandavg.getSimulationAverageSpends(), 1000);
    }

    @Test
    public void stateOfMonthTest(){
        this.timeandavg.setTotaltime(2);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(0, 500);
        this.timeandavg.addMoneyFlowOfMonth();
        this.timeandavg.addIncomeToMonth(1, 1000);

        this.timeandavg.addSpendToMonth(0, 250);
        this.timeandavg.addSpendToMonth(1, 250);
        
        assertEquals(this.timeandavg.stateOfMonth(0), 250);
    }
}
