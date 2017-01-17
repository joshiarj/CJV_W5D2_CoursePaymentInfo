/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.util;

import com.leapfrog.StudentCourse.entity.Course;
import com.leapfrog.StudentCourse.entity.Payment;
import com.leapfrog.StudentCourse.entity.Student;
import com.leapfrog.StudentCourse.DAO.CourseDAO;
import com.leapfrog.StudentCourse.DAO.Impl.CourseDAOImpl;
import com.leapfrog.StudentCourse.DAO.Impl.PaymentDAOImpl;
import com.leapfrog.StudentCourse.DAO.Impl.StudentDAOImpl;
import com.leapfrog.StudentCourse.DAO.PaymentDAO;
import com.leapfrog.StudentCourse.DAO.StudentDAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class ImportProcess {

    public void importProcess() {
        String path = "C:/Users/Zeppelin/Documents/NetBeansProjects/StudentCourse/src/com/leapfrog/StudentCourse/";
        String courseFileName = path + "course.txt";
        String studentFileName = path + "student.txt";
        String paymentFileName = path + "payment.txt";
        String outputFileName = path + "final.txt";

        CourseDAO courseDAO = new CourseDAOImpl();
        StudentDAO studentDAO = new StudentDAOImpl();
        PaymentDAO paymentDAO = new PaymentDAOImpl();
        
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(courseFileName));
            BufferedReader reader2 = new BufferedReader(new FileReader(studentFileName));
            BufferedReader reader3 = new BufferedReader(new FileReader(paymentFileName));
            String line1 = "";
            String line2 = "";
            String line3 = "";

            while ((line1 = reader1.readLine()) != null) {
                String[] tokens1 = line1.split(",");
                Course c = new Course();
                c.setCourseID(Integer.parseInt(tokens1[0]));
                c.setCourseName(tokens1[1]);
                c.setFee(Integer.parseInt(tokens1[2]));
                courseDAO.insert(c);
            }

            while ((line2 = reader2.readLine()) != null) {
                String[] tokens2 = line2.split(",");
                Student s = new Student();
                s.setStdId(Integer.parseInt(tokens2[0]));
                s.setFirstName(tokens2[1]);
                s.setLastName(tokens2[2]);
                s.setPhoneNo(Integer.parseInt(tokens2[3]));
                studentDAO.insert(s);
            }

            while ((line3 = reader3.readLine()) != null) {
                String[] tokens3 = line3.split(",");
                Payment p = new Payment();
                p.setsId(Integer.parseInt(tokens3[0]));
                p.setcId(Integer.parseInt(tokens3[1]));
                p.setPaidAmount(Integer.parseInt(tokens3[2]));
                paymentDAO.insert(p);
            }

            reader1.close();
            reader2.close();
            reader3.close();

            StringBuilder content = new StringBuilder();
            for (Student s : studentDAO.getAll()) {
                for (Course c : courseDAO.getAll()) {
                    for (Payment p : paymentDAO.getAll()) {
                        if (p.getsId() == s.getStdId() && p.getcId() == c.getCourseID()) {
                            int dueAmount = c.getFee() - p.getPaidAmount();
                            double vatAmount = 13*c.getFee()/100;
                            String outputString = s.getFirstName() + " " + s.getLastName() + "|" + c.getCourseName()
                                    + "|" + p.getPaidAmount() + "|" + dueAmount + "|" + vatAmount+"\r\n";
                            System.out.println(outputString);
                            content.append(outputString);
                        }
                    }
                }
            }
            ExportProcess.write(outputFileName, content.toString());
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
