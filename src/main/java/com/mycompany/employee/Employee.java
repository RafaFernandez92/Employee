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
        return nextEmpNum;
    }
    
    
    
    public static void main(String[] args) {
    
    }
}
