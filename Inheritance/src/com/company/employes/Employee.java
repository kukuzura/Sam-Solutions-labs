package com.company.employes;

public abstract class Employee {
    String name;
    double unitCost;

    void showName(){
        System.out.println(this.name);
    }

    abstract public double calculateSalary(int unitAmounts);

    public double payTax(double salaryBeforeTax,int percent){
        return salaryBeforeTax*(100-percent);
    }
}
