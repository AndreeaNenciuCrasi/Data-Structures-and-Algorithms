package com.company.lists.vectors;

import com.company.lists.arraylist.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<com.company.lists.arraylist.Employee> employeeList = new Vector<>();
        employeeList.add(new com.company.lists.arraylist.Employee("Jane","Jones", 123));
        employeeList.add(new com.company.lists.arraylist.Employee("John","Doe", 4567));
        employeeList.add(new com.company.lists.arraylist.Employee("Mary","Smith", 22));
        employeeList.add(new com.company.lists.arraylist.Employee("Mike","Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

    }
}
