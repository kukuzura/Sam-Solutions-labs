package com.company;

import com.company.employes.Employee;
import com.company.employes.Mechanic;
import com.company.employes.Racer;

public class Main {

    public static void main(String[] args) {
        Employee employees[] = new Employee[5];
        employees[0] = new Racer("racer1", 12.1);
        employees[1] = new Racer("racer2", 12.2);
        employees[2] = new Racer("racer3", 12.3);
        employees[3] = new Mechanic("mechanic1", 10.4);
        employees[4] = new Mechanic("mechanic2", 10.5);

        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i].calculateSalary(1));
        }




    }
}
