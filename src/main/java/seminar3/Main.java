package seminar3;

public class Main {
    public static void main(String[] args) {
        Employee[] company = {
                new Employee("Artur"
                , "Sergeevich"
                , "Gavrilov"
                , "developer"
                , 1984
                , 47000
                , "+7 912 300 44 55"),
                new Employee("Valentin"
                        , "Sergeevich"
                        , "Gavrilov"
                        , "developer"
                        , 1982
                        , 47000
                        , "+7 911 200 44 55"),
                new Employee("Samuel"
                        , "Lvovich"
                        , "Bum"
                        , "engineer"
                        , 1967
                        , 57000
                        , "+7 956 500 33 22"),
                new Employee("Liona"
                        , "Mazurbeckovna"
                        , "Minus"
                        , "manager"
                        , 1993
                        , 33000
                        , "+7 926 296 45 65"),
                new Employee("Anna"
                        , "Snegovna"
                        , "Red"
                        , "CEO"
                        , 1959
                        , 107000
                        , "+7 931 100 00 77"),
                new Employee("Elsa"
                        , "Snegovna"
                        , "White"
                        , "General manager"
                        , 1959
                        , 137000
                        , "+7 931 777 77 77"),
                new Director("Zakhar"
                        , "Glebovich"
                        , "Suroviy"
                        , "Director"
                        , 1970
                        , 100000
                        , "+7 905 111 11 77")};

        printCompanyInfo(company);
        Employee.printAvgAgeAndSalaryOfCompany(company);

        Employee.increaseSalaryOrEmployeesOverCertainAge(company, 45, 5000);
        printCompanyInfo(company);

        Director.increaseSalaryOrEmployeesOverCertainAge(company, 45, 5000);
        printCompanyInfo(company);



    }
    public static void printCompanyInfo(Employee[] employees){
        for (Employee emp: employees
             ) {
            System.out.println(emp.getEmployeeFormatInfo());
        }
    }
}
