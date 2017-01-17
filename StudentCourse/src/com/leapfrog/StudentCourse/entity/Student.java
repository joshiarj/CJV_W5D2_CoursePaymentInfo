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
public class Student {

    private int stdId, phoneNo;
    private String firstName, lastName;

    public Student() {
    }

    public Student(int stdId, int phoneNo, String firstName, String lastName) {
        this.stdId = stdId;
        this.phoneNo = phoneNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + '}';
    }

}
