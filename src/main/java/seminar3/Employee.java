package seminar3;

import java.util.Date;

public class Employee {


    private static final int CURRENT_YEAR = 2024;
    private String name;
    private String middleName;
    private String lastName;
    private String position;
    private int birth;
    private String phone;
    private double salary;


    /*
    Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
    две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
    условного оператора.
    */
    public static int compareTwoDates(int year1, int month1, int day1, int year2, int month2, int day2){
        Date dateOne = new Date(year1, month1, day1);
        Date dateTwo = new Date(year2, month2, day2);
        return dateTwo.compareTo(dateOne);
    }
    public static void printAvgAgeAndSalaryOfCompany(Employee[] employees){
        double avgSalary = 0;
        double avgAge = 0;

        for (Employee emp: employees
             ) {
            avgSalary += emp.getSalary();
            avgAge += emp.getAge();
        }

        System.out.printf("Average salary = %f; average age = %f%n", avgSalary/employees.length, avgAge/employees.length);
    }
    public static void increaseSalaryOrEmployeesOverCertainAge(Employee[] employees, int age, int amount) {
        for (Employee emp : employees
        ) {
            if (emp.getAge() > age) {
               emp.increaseSalary(amount);
            }
        }
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return CURRENT_YEAR - this.birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(String name, String middleName, String lastName, String position, int birth, double salary, String phone) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.birth = birth;
        this.salary = salary;
        this.phone = phone;
    }

    public void printEmployeeInfo() {
        System.out.println("Info: "
                + this.name + " "
                + this.middleName + " "
                + this.lastName
                + "position: " + this.position
                + "phone: " + this.phone
                + "salary: " + this.salary
                + "age: " + getAge());

    }

    public void printEmployeeFormatInfo() {
        System.out.printf("""
                        Info: %s %s %s
                        position: %s
                        phone: %s
                        salary: %f
                        age: %d %n""", this.name
                , this.middleName
                , this.lastName
                , this.position
                , this.phone
                , this.salary
                , getAge());


    }

    public String getEmployeeFormatInfo() {
        return String.format("""
                        Info: %s %s %s
                        position: %s
                        phone: %s
                        salary: %f
                        age: %d\s""",
                this.name
                , this.middleName
                , this.lastName
                , this.position
                , this.phone
                , this.salary
                , getAge());

    }
}
