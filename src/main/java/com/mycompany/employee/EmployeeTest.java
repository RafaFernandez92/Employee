/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author User
 */
public class EmployeeTest {
    
    public static void main (String args[]) {
        Employee[] projectGroup = new Employee[3];
        
        // Create 3 Employee objects
        projectGroup [0]= new Employee("John Bloggs", "jb@bmail.com");
        projectGroup[1] = new Employee("Ann Banana", "ab@bmail.com");
        projectGroup[2] = new Employee("Tom Thumb", "tt@bmail.com");

        // Print the value of nextEmpNum
        System.out.println("Next employee number: " + Employee.getNextEmpNum());

        // Search and display names of employees with empNum above a certain value (m)
        int m = 2; // Example value
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println("Employee name: " + emp.getName());
    }
    
    

        
            }
}
}
