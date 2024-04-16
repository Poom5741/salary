public class PermanentEmployee extends Empolyee {
    private double salary;

    public void setSalary(double setSalary) {
        salary = setSalary;
    }

    public double getSalary(double getSalary) {
        return this.salary;
    }

    public double getMonthlyPayment() {
        double salary = this.salary;
        if (this.performanceScore >=8) {
            salary = salary * 1.03;
        }
        
        double socialSec = salary * 0.05;
        if (socialSec <= 750) {
            salary = salary - socialSec;
            return salary;
        } else if (socialSec >750) {
            salary = salary - 750;
            return salary;
        }
    }
}
