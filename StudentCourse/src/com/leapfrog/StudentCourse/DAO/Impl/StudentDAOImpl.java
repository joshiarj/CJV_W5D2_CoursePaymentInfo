/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.DAO.Impl;

import com.leapfrog.StudentCourse.entity.Student;
import com.leapfrog.StudentCourse.DAO.StudentDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class StudentDAOImpl implements StudentDAO{
    private List<Student> studentList=new ArrayList<>();
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public boolean insert(Student s) {
        return studentList.add(s);
    }
    
}
