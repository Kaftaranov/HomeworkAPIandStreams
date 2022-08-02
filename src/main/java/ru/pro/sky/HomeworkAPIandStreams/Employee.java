package ru.pro.sky.HomeworkAPIandStreams;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String middlename;
    private final String surname;
    private final double salary;
    private final int departmentId;

    public Employee(String name, String middlename, String surname, int departmentId, Double salary)
    {   this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.departmentId = departmentId;
        this.salary = salary;
    }
    public  String getName() {return name;}
    public  String getSurname() {return surname;}


    public Double getSalary() {
        return salary;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public Double setSalary(double salary) {
        return salary;
    }

    @Override
    public String toString(){
        return (name + " " + middlename + " " + surname + ", " + "salary - " + salary);
    }

    @Override
    public boolean equals(Object tocompare){
        if (this.getClass()!= tocompare.getClass()){
            return false;
        }
        Employee e = (Employee) tocompare;
        return (name.equals(e.name)&&surname.equals(e.surname));
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname);
    }
}

