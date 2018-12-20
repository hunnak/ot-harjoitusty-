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
    public void setTotalTimeNgetTotaltime(){
        this.timeandavg.setTotaltime(3);
        assertEquals(3,this.timeandavg.getTotalTime());
    }
    @Test
    public void isThereMonth(){
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
    
}
