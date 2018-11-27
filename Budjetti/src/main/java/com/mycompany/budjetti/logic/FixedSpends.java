package com.mycompany.budjetti.logic;

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
Fixed spends rent, mininum spend on food, hygienia, buscard, car payment & gas, loan payments, stabile hobbies,
stabile student organization fees. 
*/
public class FixedSpends {
    
        private int totalspend;
    public FixedSpends(){
        
    }
    public void setTotalSpends(int x){
        this.totalspend=x;
    }
    public int getSpends(){
        return this.totalspend;
    }
    public void setRent(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setMinFood(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setHyg(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setLoanPay(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setHob(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setStuOrgFe(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setBuscard(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setCar(int x){
        this.totalspend=this.totalspend+x;
    }
    public void setSUPRISEgotUnluckly(int x){
        this.totalspend=this.totalspend+x;
    }
    
}
