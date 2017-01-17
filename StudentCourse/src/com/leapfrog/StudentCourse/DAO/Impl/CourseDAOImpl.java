/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.DAO.Impl;

import com.leapfrog.StudentCourse.entity.Course;
import com.leapfrog.StudentCourse.DAO.CourseDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CourseDAOImpl implements CourseDAO {

    private List<Course> courseList = new ArrayList<>();

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public boolean insert(Course c) {
        return courseList.add(c);

    }

}
