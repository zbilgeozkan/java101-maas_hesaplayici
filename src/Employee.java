public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public double tax () {
        double tax = 0;
        if (salary > 1000) {
            tax += (salary * 3) / 100;
        }
        else {
            tax = 0;
        }
        return tax;
    }
    public double bonus () {
        double bonusFee ;
        if (workHours > 40) {
            bonusFee = (workHours - 40) * 30;
        }
        else {
            bonusFee = 0;
        }
        return bonusFee;
    }
    public double raiseSalary () {
        double increasedSalary = 0;
        if ((2021 - hireYear) < 10 ) {
            increasedSalary += (salary * 5) / 100;
        }
        if (((2021 - hireYear) > 9) && ((2021 - hireYear) < 20)) {
            increasedSalary += (salary * 10) / 100;
        }
        if ((2021 - hireYear) > 19) {
            increasedSalary += (salary * 15) / 100;
        }
        return increasedSalary;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work hours: " + this.workHours);
        System.out.println("The year of starting work: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary increase : " + raiseSalary());
        System.out.println("Salary with taxes and bonus: " + (salary + bonus() - tax()));
        System.out.println("Total Salary: " + (salary +  raiseSalary()));
    }

}