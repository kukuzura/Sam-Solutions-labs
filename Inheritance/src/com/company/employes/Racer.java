package com.company.employes;

public class Racer extends Employee{

   public Racer(String name,double unitCost){
        this.name=name;
        this.unitCost=unitCost;
    }

    @Override
    public double calculateSalary(int unitsAmount) {
        return unitCost*unitsAmount;
    }
}
