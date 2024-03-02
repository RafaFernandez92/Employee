/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee;
//Github: 
/**
 *
 * @author User
 */
public class Employee {
    String name;
    String email;
    int empNum;
    private int nextEmpNum = 1;
    
    public Employee(String nameDef, String emailDef){
        this.name = nameDef;
        this.email = emailDef;
        this.empNum = nextEmpNum++;
        }
    
    public Employee(int Num){
        this.empNum = Num;
        this.empNum = nextEmpNum++;
        }
    //increment
    public void incrementNum() {
        empNum = nextEmpNum++;
        
    }
    //Returners 
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getEmpNum(){
        return empNum;
    }
    
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Email must be at least 4 characters long.");
        }
    
    public int getNextEmpNum(){
        return nextEmpNum;
    }   
public class EmployeeTest {
    public void main(String[] args) {
        Employee[] projectGroup = new Employee[3];

        // Create 3 Employee objects
        projectGroup[0] = new Employee("John Bloggs", "jb@bmail.com");
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