package seminar3;

public class Director extends Employee {
    public Director(String name, String middleName, String lastName, String position, int birth, double salary, String phone) {
        super(name, middleName, lastName, position, birth, salary, phone);
    }

    public static void increaseSalaryOrEmployeesOverCertainAge(Employee[] employees, int age, int amount) {
        for (Employee emp : employees
        ) {
            if (emp.getAge() > age && !(emp instanceof Director)) {
                emp.increaseSalary(amount);
            }
        }
    }
}
