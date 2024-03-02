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
    
    public Employee(String nameDef, String emailDef){
        this.name = nameDef;
        this.email = emailDef;
        }
    
    public Employee(int Num){
        this.empNum = Num;
        }
    
    static void incrementNum() {
        int nextEmpnum = 1;
        empNum = nextEmpnum++;
        
    }
    
    public static void main(String[] args) {
    
    }
}
