package com.company;

public class Family {
    String FatherName;
    String MotherName;
    String SonName;
    String DaughterName;
    int FatherSalary;
    int MotherSalary;
    int SonFee;
    int DaughterFee;
    int Grocery = 500;

    public Family(String FatherName,String MotherName,String SonName,String DaughterName){
        this.FatherName= FatherName;
        this.MotherName= MotherName;
        this.SonName = SonName;
        this.DaughterName = DaughterName;
    }
    public void displayNames() {
        System.out.println(" father name: " + this.FatherName + "mother name: " + this.MotherName + "son name: " + this.SonName + " Daughter Name: " + this.DaughterName);
    }
}
