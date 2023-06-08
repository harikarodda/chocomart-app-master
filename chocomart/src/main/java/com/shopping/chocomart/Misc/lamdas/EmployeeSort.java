package com.shopping.chocomart.Misc.lamdas;


import com.fasterxml.jackson.core.JsonToken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    public String empName;
    public int empNumber;
    Employee (String empName, int empNumber){
        this.empName=empName;
        this.empNumber=empNumber;
    }

    public String toString(){
        return empName+"-"+empNumber;
    }
}
public class EmployeeSort {
     public static  void main(String Aregs[]){
         System.out.println("Main method invoked");

         ArrayList<Employee> employeeList= new ArrayList<>();
         employeeList.add(new Employee("ZZZZ",999));
         employeeList.add(new Employee("BBBB",234));
         employeeList.add(new Employee("CCCC",345));
         System.out.println(employeeList);
         /*Comparator<Employee> C = new Comparator<Employee>() {
             @Override
             public int compare(Employee o1, Employee o2) {
                 return (o1.empNumber==o2.empNumber)?0:(o1.empNumber>o2.empNumber ? 1:-1);
             }
         };
         Collections.sort(employeeList,C);*/
         //if we see- above is not possible
        Collections.sort(employeeList,(o1,o2)->(o1.empNumber==o2.empNumber)?0:(o1.empNumber>o2.empNumber ? 1:-1));
         System.out.println(employeeList +"this is sortede list");
         ArrayList<Employee> listNameSorted= new ArrayList<>(); //to do - save to new list and print
         Collections.sort(employeeList,(o1,o2)->(o1.empName.compareTo(o2.empName)));
            employeeList.forEach(System.out::println);

     }
}
