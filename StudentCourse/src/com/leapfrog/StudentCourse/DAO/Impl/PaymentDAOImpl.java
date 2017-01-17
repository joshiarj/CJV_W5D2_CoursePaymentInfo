/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.DAO.Impl;

import com.leapfrog.StudentCourse.entity.Payment;
import com.leapfrog.StudentCourse.DAO.PaymentDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class PaymentDAOImpl implements PaymentDAO {
    private List<Payment> paymentList = new ArrayList<>();
    @Override
    public List<Payment> getAll() {
        return paymentList;
    }

    @Override
    public boolean insert(Payment p) {
        return paymentList.add(p);
    }
    
}
