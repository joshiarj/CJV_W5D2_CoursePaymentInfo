/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.entity;

/**
 *
 * @author Lenovo
 */
public class Payment {
    private int sId, cId, paidAmount;

    public Payment() {
    }

    public Payment(int sId, int cId, int paidAmount) {
        this.sId = sId;
        this.cId = cId;
        this.paidAmount = paidAmount;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        return "Payment{" + "sId=" + sId + ", cId=" + cId + ", paidAmount=" + paidAmount + '}';
    }

//    public String toCSV(){
//        return 
//    }
    
}
