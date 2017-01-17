/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentCourse.DAO;

import com.leapfrog.StudentCourse.entity.Course;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface CourseDAO {
    List<Course> getAll();
    boolean insert(Course c);
}
