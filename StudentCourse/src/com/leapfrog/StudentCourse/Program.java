/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse;

import com.leapfrog.StudentCourse.entity.Course;
import com.leapfrog.StudentCourse.entity.Payment;
import com.leapfrog.StudentCourse.entity.Student;
import com.leapfrog.StudentCourse.DAO.CourseDAO;
import com.leapfrog.StudentCourse.DAO.Impl.CourseDAOImpl;
import com.leapfrog.StudentCourse.DAO.Impl.PaymentDAOImpl;
import com.leapfrog.StudentCourse.DAO.Impl.StudentDAOImpl;
import com.leapfrog.StudentCourse.DAO.PaymentDAO;
import com.leapfrog.StudentCourse.DAO.StudentDAO;
import com.leapfrog.StudentCourse.util.ExportProcess;
import com.leapfrog.StudentCourse.util.ImportProcess;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       CourseDAO courseDAO=new CourseDAOImpl();
       StudentDAO studentDAO= new StudentDAOImpl();
       PaymentDAO paymentDAO = new PaymentDAOImpl();
       ImportProcess imp = new ImportProcess();
       imp.importProcess();
       
//       for (Student s : studentDAO.getAll()) {
//                for (Course c : courseDAO.getAll()) {
//                    for (Payment p : paymentDAO.getAll()) {
//                        if (p.getsId() == s.getStdId() && p.getcId() == c.getCourseID()) {
//                            int dueAmount = c.getFee() - p.getPaidAmount();
//                            double vatAmount = 13*c.getFee()/100;
//                            System.out.println(s.getFirstName() + " " + s.getLastName() + "|" + c.getCourseName()
//                                    + "|" + p.getPaidAmount() + "|" + dueAmount + "|" + vatAmount);
//                        }
//                    }
//                }
//            }
    }
}