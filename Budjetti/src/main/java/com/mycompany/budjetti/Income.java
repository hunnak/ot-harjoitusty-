package com.mycompany.budjetti;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joelhunn
 */
/*
Salary, benefits, pension, extrawork, dividend, sidebusiness, suprise
*/
public class Income {
    
        private int totalIncome;
    public Income(){
        
    }
    public void setTotalIncome(int x){
        this.totalIncome=x;
    }
    public int getIncome(){
        return this.totalIncome;
    }
    
    public void setSalary(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setBenefits(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setPension(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setExtraWork(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setDividend(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setSidebussiness(int x){
        this.totalIncome=this.totalIncome+x;
    }
    public void setSuprise(int x){
        this.totalIncome=this.totalIncome+x;
    }
    
    
}
