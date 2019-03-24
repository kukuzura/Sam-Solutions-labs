package com.company.employes;

public class Mechanic extends Employee{

    public Mechanic(String name,double unitCost){
        this.name=name;
        this.unitCost=unitCost;
    }

    @Override
   public double calculateSalary(int unitAmounts) {
        return unitAmounts*unitCost;
    }

    void getDrunk(){
        System.out.println("I'm drunk");
    }

}
