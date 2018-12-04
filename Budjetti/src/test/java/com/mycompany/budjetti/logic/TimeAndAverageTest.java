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
    Income income;
    FixedSpends fixspends;
    @Before
    public void setUp() {
        timeandavg= new TimeAndAverage();
        income = new Income();
        fixspends = new FixedSpends();
    }
    
    @Test
    public void setTotalTimeNgetTotaltime(){
        this.timeandavg.setTotaltime(3);
        assertEquals(3,this.timeandavg.getTotalTime());
    }
   
}
