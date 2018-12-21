/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budjetti.logic;

/**
 *
 * @author joelhunn
 *
 */

/**
 * This Class will include incomes and spends
 */
public class MoneyFlow {

    private int totalIncome;
    private int totalspend;

    public MoneyFlow() {
        totalIncome = 0;
        totalspend = 0;
    }

    public void setTotalIncome(int x) {
        this.totalIncome = x;
    }

    public int getIncome() {
        return this.totalIncome;
    }

    public void addIncome(int x) {
        this.totalIncome = this.totalIncome + x;
    }

    public void setTotalSpends(int x) {
        this.totalspend = x;
    }

    public int getSpends() {
        return this.totalspend;
    }

    public void addSpend(int x) {
        this.totalspend = this.totalspend + x;
    }

}
