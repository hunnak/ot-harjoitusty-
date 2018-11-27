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
public class FixedSpendsTest {
    
    FixedSpends fixspends;
    
    @Before
    public void setUp() {
        this.fixspends= new FixedSpends();
    }
    
    @Test
    public void setAndGetTotalSpends(){
        this.fixspends.setTotalSpends(600);
        assertEquals(600,this.fixspends.getSpends());
    }
    
    @Test
    public void setRentTest(){
        this.fixspends.setRent(500);
        assertEquals(500,this.fixspends.getSpends());
    }
    
    @Test
    public void setHygTest(){
        this.fixspends.setRent(500);
        this.fixspends.setHyg(5);
        assertEquals(505,this.fixspends.getSpends());
    }
    
    @Test
    public void setMinFoodTest(){
        this.fixspends.setRent(500);
        this.fixspends.setMinFood(100);
        assertEquals(600,this.fixspends.getSpends());
    }
    
    @Test
    public void setLoanPayTest(){
        this.fixspends.setRent(500);
        this.fixspends.setLoanPay(50);
        assertEquals(550,this.fixspends.getSpends());
    }
    
    @Test
    public void setHobTest(){
        this.fixspends.setRent(500);
        this.fixspends.setHob(20);
        assertEquals(520,this.fixspends.getSpends());
    }
    
    @Test
    public void setStudentOrganizationFeeTest(){
        this.fixspends.setRent(500);
        this.fixspends.setStuOrgFe(1);
        assertEquals(501,this.fixspends.getSpends());
    }
    
    @Test
    public void setBusCardTest(){
        this.fixspends.setRent(500);
        this.fixspends.setBuscard(50);
        assertEquals(550,this.fixspends.getSpends());
    }
    
    @Test
    public void setCarTest(){
        this.fixspends.setRent(500);
        this.fixspends.setCar(0);
        assertEquals(500,this.fixspends.getSpends());
    }
    
    @Test
    public void setTaxTest(){
        //add here the method!
        this.fixspends.setRent(500);
        assertEquals(500,this.fixspends.getSpends());
    }
    
    @Test
    public void setSupriseTest(){
        this.fixspends.setRent(500);
        this.fixspends.setSUPRISEgotUnluckly(250);
        assertEquals(750,this.fixspends.getSpends());
    }
    
    @Test
    public void setInsuranceTest(){
        this.fixspends.setRent(500);
        //add here the method!
        assertEquals(500,this.fixspends.getSpends());
    }

}
