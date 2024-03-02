/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee;

/**
 *
 * @author User
 */
public class Employee {
    String name;
    String email;
    int empNum;
    
    public nameEmail(String nameDef, String emailDef){
        name = nameDef;
        email = emailDef;
        System.out.println(name + email);
    }
    
    public employeeNum(int Num){
        empNum = Num;
        System.out.println(empNum);
    }
    public static void main(String[] args) {
        nameEmail first = new nameEmail("Rafael", "Def@defau.com");
        System.out.println(first.name + first.email);
    }
}
