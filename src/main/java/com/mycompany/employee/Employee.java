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
    private String name;
    private String email;
    private int empNum;
    private int nextEmpNum = 1;
    
    /**
     *
     * @param nameDef
     * @param emailDef
     */
    public Employee(String nameDef, String emailDef){
        this.name = nameDef;
        this.email = emailDef;
        this.empNum = nextEmpNum++;
        }
    
    /**
     *
     * @param Num
     */
    public Employee(int Num){
        this.empNum = 1;
        this.empNum = nextEmpNum++;
        }
    //increment

    /**
     *
     */
    public void incrementNum() {
        empNum = nextEmpNum++;
        
    }
    //Returners 

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     *
     * @return
     */
    public int getEmpNum(){
        return empNum;
    }
    
    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Email must be at least 4 characters long.");
        }
    
    /**
     *
     * @return
     */
    public int getNextEmpNum(int NextEmpNum){
        return nextEmpNum;
    }   

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        }
}
