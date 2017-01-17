/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.DAO;

import com.leapfrog.StudentCourse.entity.Payment;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface PaymentDAO {
    List<Payment> getAll();
    boolean insert(Payment p);
}
